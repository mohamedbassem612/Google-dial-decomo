package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaog {
    public final android.view.ViewGroup a;
    public android.view.View b;
    public final defpackage.aaom c;

    public aaog(android.view.ViewGroup viewGroup, defpackage.aaom aaomVar) {
        this.c = aaomVar;
        aais.as(viewGroup);
        this.a = viewGroup;
    }

    public final void a(jxt jxtVar) {
        try {
            defpackage.aaom aaomVar = this.c;
            defpackage.ylo yloVar = new defpackage.ylo(this, jxtVar, 10);
            android.os.Parcel parcelEP = aaomVar.eP();
            yld.f(parcelEP, yloVar);
            aaomVar.eR(9, parcelEP);
        } catch (android.os.RemoteException e) {
            throw new defpackage.aaos(e);
        }
    }
}
