package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anti extends defpackage.antk {
    private final defpackage.anpk a;
    private final anph b;
    private final defpackage.aodj c;

    public anti(defpackage.ansf ansfVar, int i, defpackage.anpk anpkVar, anph anphVar, defpackage.aodj aodjVar) {
        super(ansfVar, i, aodjVar);
        this.a = anpkVar;
        this.b = anphVar;
        this.c = aodjVar;
    }

    @Override // defpackage.antk
    protected final int a(android.os.Parcel parcel) {
        defpackage.anpk anpkVar = this.a;
        parcel.writeString(anpkVar.b);
        defpackage.antb.b(parcel, this.b);
        this.c.a();
        return anpkVar.a.b() ? 16 : 0;
    }

    @Override // defpackage.antk
    protected final int b(android.os.Parcel parcel) {
        return 0;
    }

    final void c(anmw anmwVar) {
        anph anphVar = this.b;
        anpc anpcVar = anxo.b;
        anphVar.f(anpcVar);
        anphVar.h(anpcVar, java.lang.Long.valueOf(anmwVar.b(java.util.concurrent.TimeUnit.NANOSECONDS)));
    }
}
