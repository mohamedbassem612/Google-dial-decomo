package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bjj {
    public long a = 0;
    final /* synthetic */ aomy b;
    public final /* synthetic */ aomy c;
    public final /* synthetic */ defpackage.blz d;

    public bjj(aomy aomyVar, defpackage.blz blzVar, aomy aomyVar2) {
        this.b = aomyVar;
        this.d = blzVar;
        this.c = aomyVar2;
    }

    public final void a() {
        this.d.d();
    }

    public final boolean b() {
        aomy aomyVar = this.b;
        if (aomyVar == null) {
            return true;
        }
        return bma.a(this.d, ((java.lang.Number) aomyVar.a()).longValue());
    }
}
