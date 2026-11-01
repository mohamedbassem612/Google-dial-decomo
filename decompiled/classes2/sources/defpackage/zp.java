package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class zp {
    public static final defpackage.zp a;
    public static final defpackage.zp b;
    public final int c;
    public final defpackage.zn d;
    public final boolean e;

    static {
        defpackage.zo zoVar = new defpackage.zo();
        zoVar.a = 0;
        zoVar.b = defpackage.zn.b;
        zoVar.c = false;
        defpackage.zp zpVar = new defpackage.zp(zoVar);
        a = zpVar;
        defpackage.zo zoVar2 = new defpackage.zo(zpVar);
        zoVar2.a = 2;
        zoVar2.b = defpackage.zn.c;
        zoVar2.c = false;
        new defpackage.zo(zpVar).b = defpackage.zn.d;
        defpackage.zo zoVar3 = new defpackage.zo(zpVar);
        zoVar3.b = defpackage.zn.d;
        zoVar3.c = true;
        defpackage.zo zoVar4 = new defpackage.zo(zpVar);
        zoVar4.b = defpackage.zn.d;
        zoVar4.c = true;
        defpackage.zo zoVar5 = new defpackage.zo(zpVar);
        zoVar5.b = defpackage.zn.e;
        zoVar5.c = true;
        b = new defpackage.zp(zoVar5);
    }

    public zp(defpackage.zo zoVar) {
        this.c = zoVar.a;
        this.d = zoVar.b;
        this.e = zoVar.c;
    }

    public final void a(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.xh xhVar = (defpackage.xh) it.next();
            if (xhVar instanceof androidx.car.app.model.Row) {
                this.d.a((androidx.car.app.model.Row) xhVar);
            } else if (!(xhVar instanceof androidx.car.app.messaging.model.ConversationItem) && !(xhVar instanceof androidx.car.app.model.Banner)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Unsupported item type: %s", xhVar.getClass().getSimpleName()));
            }
        }
    }
}
