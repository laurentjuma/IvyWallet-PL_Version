import com.ivy.buildsrc.AssertK
import com.ivy.buildsrc.Hilt
import com.ivy.buildsrc.JUnit5

plugins {
    `android-library`
    `kotlin-android`

    id("de.mannodermaus.android-junit5") version "1.9.3.0"

}

apply<com.ivy.buildsrc.IvyPlugin>()

dependencies {
    implementation("org.junit.jupiter:junit-jupiter:5.8.1")
    implementation("com.willowtreeapps.assertk:assertk-jvm:0.24")
    AssertK()
    JUnit5()
    Hilt()
    implementation(project(":common:main"))
    implementation(project(":parser"))
}
android {
    namespace = "com.ivy.math"
}
