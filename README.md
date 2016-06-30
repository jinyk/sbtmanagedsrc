# SBT Managed Sources

I would like to have a task that I can run to generate some code. I don't want
to generate this with each build, just manually run this task once in a while.
So in this project I can run `sbt gensomecode` which creates
`target/scala-2.11/src_managed/main/SomeGenCode.scala`.

I would like to make this code available to the root project.

The only thing I can figure out to do is to include the default `sourceManaged`
directory in the root project's `unmanagedSourceDirectories` (see
`build.sbt:line 4`). This is ugly as hell and doesn't seem like it's how
managed sources are supposed to be handled.

I'm probably not understanding something basic about sbt's managed sources
concept or how to handle the situation of creating an sbt task to generate
sources.
