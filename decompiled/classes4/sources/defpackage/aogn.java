package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aogn {
    public static final appb a;
    public static final appb b;
    public static final appb c;
    public static final appb d;
    public static final appb e;
    public final appb f;
    public final appb g;
    final int h;

    static {
        appb appbVar = appb.a;
        a = aoov.aQ(":status");
        b = aoov.aQ(":method");
        c = aoov.aQ(":path");
        d = aoov.aQ(":scheme");
        e = aoov.aQ(":authority");
        aoov.aQ(":host");
        aoov.aQ(":version");
    }

    public aogn(appb appbVar, appb appbVar2) {
        this.f = appbVar;
        this.g = appbVar2;
        this.h = appbVar.c() + 32 + appbVar2.c();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aogn)) {
            return false;
        }
        defpackage.aogn aognVar = (defpackage.aogn) obj;
        return this.f.equals(aognVar.f) && this.g.equals(aognVar.g);
    }

    public final int hashCode() {
        return ((this.f.hashCode() + 527) * 31) + this.g.hashCode();
    }

    public final java.lang.String toString() {
        return java.lang.String.format("%s: %s", this.f.i(), this.g.i());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aogn(appb appbVar, java.lang.String str) {
        this(appbVar, aoov.aQ(str));
        appb appbVar2 = appb.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aogn(java.lang.String str, java.lang.String str2) {
        this(aoov.aQ(str), aoov.aQ(str2));
        appb appbVar = appb.a;
    }
}
