
resolvers ++= Seq(
  "im.nexus" at "http://nexus.svc.m.infra-host.com/nexus/content/groups/intel_media_maven/",
  "scct-github-repository" at "http://mtkopone.github.com/scct/maven-repo"
)

addSbtPlugin("intelmedia.build" %% "sbt-imbuild" % "5.1.+")

addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.3.0")

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
