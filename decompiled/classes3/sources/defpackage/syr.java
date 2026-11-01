package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class syr extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public syr(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.syr.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        java.util.List list = (java.util.List) obj;
        lgj lgjVar = (lgj) list.get(0);
        android.content.Context context = (android.content.Context) list.get(1);
        ipc ipcVar = (ipc) list.get(2);
        if (lgjVar == lgj.c) {
            optionalOf = j$.util.Optional.empty();
        } else {
            defpackage.otc otcVarAo = pez.ao();
            otcVarAo.e(false);
            otcVarAo.d(false);
            otcVarAo.b(false);
            optionalOf = j$.util.Optional.of(defpackage.afap.b(context, 0, ipcVar.bk(otcVarAo.a()), 67108864));
        }
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
