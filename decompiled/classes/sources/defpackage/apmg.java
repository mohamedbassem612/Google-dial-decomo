package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apmg {
    public static final defpackage.appb a;
    public static final defpackage.appb b;
    public static final defpackage.appb c;
    public static final defpackage.appb d;
    public static final defpackage.appb e;
    public static final defpackage.appb f;
    public final defpackage.appb g;
    public final defpackage.appb h;
    public final int i;

    static {
        defpackage.appb appbVar = defpackage.appb.a;
        a = defpackage.aoov.aQ(":");
        b = defpackage.aoov.aQ(":status");
        c = defpackage.aoov.aQ(":method");
        d = defpackage.aoov.aQ(":path");
        e = defpackage.aoov.aQ(":scheme");
        f = defpackage.aoov.aQ(":authority");
    }

    public apmg(defpackage.appb appbVar, defpackage.appb appbVar2) {
        if (appbVar == null) {
            defpackage.aooh.i("name");
        }
        if (appbVar2 == null) {
            defpackage.aooh.i("value");
        }
        this.g = appbVar;
        this.h = appbVar2;
        this.i = appbVar.c() + 32 + appbVar2.c();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.apmg) {
            defpackage.apmg apmgVar = (defpackage.apmg) obj;
            if (defpackage.aooh.n(this.g, apmgVar.g) && defpackage.aooh.n(this.h, apmgVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.g.hashCode() * 31) + this.h.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.appb appbVar = this.h;
        return this.g.i() + ": " + appbVar.i();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public apmg(defpackage.appb appbVar, java.lang.String str) {
        this(appbVar, defpackage.aoov.aQ(str));
        if (appbVar == null) {
            defpackage.aooh.i("name");
        }
        if (str == null) {
            defpackage.aooh.i("value");
        }
        defpackage.appb appbVar2 = defpackage.appb.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public apmg(java.lang.String str, java.lang.String str2) {
        this(defpackage.aoov.aQ(str), defpackage.aoov.aQ(str2));
        if (str == null) {
            defpackage.aooh.i("name");
        }
        defpackage.appb appbVar = defpackage.appb.a;
    }
}
