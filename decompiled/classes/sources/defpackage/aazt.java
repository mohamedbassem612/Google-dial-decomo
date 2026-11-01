package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aazt {
    public java.lang.String a;
    public defpackage.aonj b;
    public defpackage.aonj c;
    private final java.lang.String d;
    private final defpackage.ajct e;
    private final defpackage.ahyn f;
    private java.lang.String g;
    private final defpackage.ahyn h;
    private final defpackage.aoss i;
    private final defpackage.aazz j;

    public aazt(java.lang.String str, defpackage.ajct ajctVar, defpackage.aazz aazzVar, defpackage.ahyn ahynVar) {
        defpackage.aooh.f(str, "packageName");
        defpackage.aooh.f(ajctVar, "executor");
        this.d = str;
        this.e = ajctVar;
        this.j = aazzVar;
        this.f = ahynVar;
        this.a = "";
        this.h = defpackage.ahwt.a;
        this.i = defpackage.aosv.n(new defpackage.aotu(ajctVar).plus(new defpackage.aovh(null)));
    }

    public final defpackage.acvk a() {
        if (this.c == null) {
            throw new java.lang.IllegalArgumentException("LabelsSupplier must be set");
        }
        if (this.a.length() <= 0) {
            throw new java.lang.IllegalArgumentException("RoleId must be set");
        }
        if (this.b == null) {
            throw new java.lang.IllegalArgumentException("PopulatorIsEnabledFlag must be set");
        }
        java.lang.String str = this.g;
        defpackage.aazd aazdVar = new defpackage.aazd(this.d, this.a, str);
        defpackage.aazz aazzVar = this.j;
        defpackage.aoss aossVar = this.i;
        defpackage.aonj aonjVar = this.c;
        defpackage.aooh.c(aonjVar);
        defpackage.ahyn ahynVar = this.h;
        defpackage.aonj aonjVar2 = this.b;
        defpackage.aooh.c(aonjVar2);
        return new defpackage.aazs(aazzVar, aossVar, aazdVar, aonjVar, ahynVar, aonjVar2, this.f);
    }

    public final void b() {
        this.g = "com.google.android.dialer";
    }
}
