package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ailz implements defpackage.aimn {
    final /* synthetic */ ahyc a;

    public ailz(ahyc ahycVar) {
        this.a = ahycVar;
    }

    @Override // defpackage.aimn
    public final void a(java.lang.Object obj, defpackage.aimm aimmVar) {
        for (int i : ((defpackage.aizh) this.a.apply(obj)).e()) {
            aimmVar.a(java.lang.Integer.valueOf(i));
        }
    }
}
