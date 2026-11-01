package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qvm implements zne {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ qvm(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final void b(android.telecom.Call call, int i) {
        if (this.$cid != 0) {
            if (i == 3) {
                java.lang.Object obj = this.a;
                aenj aenjVar = ruc.C;
                ruc rucVar = ((defpackage.qoz) obj).a;
                rucVar.m(aenjVar);
                rucVar.o(aenjVar);
                return;
            }
            return;
        }
        if (i == 3) {
            java.lang.Object obj2 = this.a;
            aenj aenjVar2 = ruc.B;
            ruc rucVar2 = ((defpackage.qvo) obj2).c;
            rucVar2.m(aenjVar2);
            rucVar2.o(aenjVar2);
        }
    }
}
