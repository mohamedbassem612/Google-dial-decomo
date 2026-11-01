package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gpe {
    public final gmv a;
    public final defpackage.gqd b;
    private final android.content.res.Configuration c;
    private final float d;

    public gpe(gmv gmvVar, defpackage.gqd gqdVar, android.content.res.Configuration configuration, float f) {
        aooh.f(configuration, "configuration");
        this.a = gmvVar;
        this.b = gqdVar;
        this.c = configuration;
        this.d = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gpe) {
            defpackage.gpe gpeVar = (defpackage.gpe) obj;
            if (aooh.n(this.a, gpeVar.a) && aooh.n(this.b, gpeVar.b) && aooh.n(this.c, gpeVar.c) && java.lang.Float.compare(this.d, gpeVar.d) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + java.lang.Float.floatToIntBits(this.d);
    }

    public final java.lang.String toString() {
        return "ParentContainerInfo(windowBounds=" + this.a + ", windowLayoutInfo=" + this.b + ", configuration=" + this.c + ", density=" + this.d + ')';
    }
}
