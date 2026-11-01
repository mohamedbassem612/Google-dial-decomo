package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afyy extends dwj {
    final /* synthetic */ defpackage.afzb a;
    final /* synthetic */ defpackage.afza b;

    public afyy(defpackage.afza afzaVar, defpackage.afzb afzbVar) {
        this.a = afzbVar;
        j$.util.Objects.requireNonNull(afzaVar);
        this.b = afzaVar;
    }

    public final void a(int i) {
        this.b.o = true;
        this.a.a(i);
    }

    public final void b(android.graphics.Typeface typeface) {
        defpackage.afza afzaVar = this.b;
        afzaVar.m = android.graphics.Typeface.create(typeface, afzaVar.d);
        afzaVar.o = true;
        this.a.b(afzaVar.m, false);
    }
}
