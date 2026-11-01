package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wiz implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ defpackage.wjb a;
    final /* synthetic */ long b;

    public wiz(defpackage.wjb wjbVar, long j, int i) {
        this.$cid = i;
        this.a = wjbVar;
        this.b = j;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.Object call() {
        int i = this.$cid;
        defpackage.wjb wjbVar = this.a;
        if (i != 0) {
            akzx akzxVar = wjbVar.c;
            akzxVar.u();
            aiyr aiyrVar = akzxVar.b;
            aiyr aiyrVar2 = aiyr.a;
            aiyrVar.b |= 2;
            aiyrVar.d = this.b;
        } else {
            akzx akzxVar2 = wjbVar.c;
            akzxVar2.u();
            aiyr aiyrVar3 = akzxVar2.b;
            aiyr aiyrVar4 = aiyr.a;
            aiyrVar3.b |= 4;
            aiyrVar3.f = this.b;
        }
        return null;
    }
}
