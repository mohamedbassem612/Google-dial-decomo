package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afaw {
    public static final defpackage.afaw a;
    public static final defpackage.afaw b;
    public final boolean c;
    public final boolean d;
    public final aify e;
    public final aify f;

    static {
        defpackage.afav afavVar = new defpackage.afav();
        afavVar.c();
        a = afavVar.a();
        defpackage.afav afavVar2 = new defpackage.afav();
        afavVar2.c();
        afavVar2.b(new defpackage.afau());
        afavVar2.a();
        defpackage.afav afavVar3 = new defpackage.afav();
        ahvr.bZ(afavVar3.a == null, "A SourcePolicy can only set internal() or external() once.");
        afavVar3.a = java.lang.Boolean.TRUE;
        b = afavVar3.a();
    }

    public afaw(boolean z, boolean z2, aify aifyVar, aify aifyVar2) {
        this.c = z;
        this.d = z2;
        this.e = aifyVar;
        this.f = aifyVar2;
    }

    public static defpackage.afaw a(java.lang.String str) {
        defpackage.afav afavVar = new defpackage.afav();
        afavVar.c();
        afavVar.b = true;
        afavVar.b(new defpackage.afat(str));
        return afavVar.a();
    }
}
