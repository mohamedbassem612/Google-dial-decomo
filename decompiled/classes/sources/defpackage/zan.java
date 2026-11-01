package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zan {
    public final defpackage.aenj a;
    public final int b;
    public final defpackage.aoin c;
    public final defpackage.zar d;

    public zan(defpackage.aenj aenjVar, int i, defpackage.aoin aoinVar, defpackage.zar zarVar) {
        this.a = aenjVar;
        this.b = i;
        this.c = aoinVar;
        this.d = zarVar;
    }

    public static /* synthetic */ defpackage.zan a(defpackage.zan zanVar, defpackage.aenj aenjVar, int i, defpackage.aoin aoinVar) {
        return new defpackage.zan(aenjVar, i, aoinVar, zanVar.d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zan) {
            defpackage.zan zanVar = (defpackage.zan) obj;
            if (defpackage.aooh.n(this.a, zanVar.a) && this.b == zanVar.b && defpackage.aooh.n(this.c, zanVar.c) && this.d == zanVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "SemanticEventData(cuiName=" + this.a + ", interactionId=" + this.b + ", isEnabled=" + this.c + ", errorCode=" + this.d + ')';
    }
}
