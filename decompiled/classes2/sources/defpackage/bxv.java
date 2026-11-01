package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bxv implements aonj {
    final /* synthetic */ ccp a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ccp c;
    final /* synthetic */ defpackage.bwj d;

    public bxv(defpackage.bwj bwjVar, ccp ccpVar, boolean z, ccp ccpVar2) {
        this.d = bwjVar;
        this.a = ccpVar;
        this.b = z;
        this.c = ccpVar2;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        android.view.KeyEvent keyEvent = ((defpackage.cui) obj).a;
        defpackage.bwj bwjVar = this.d;
        if (!bwjVar.c()) {
            this.a.b(java.lang.Boolean.FALSE);
        } else {
            if (this.b && !keyEvent.isShiftPressed() && a.x(un.j(keyEvent), 2) && anty.ah(un.k(keyEvent), un.h(61))) {
                ccp ccpVar = this.a;
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                ccpVar.b(bool);
                return bool;
            }
            if (a.x(un.j(keyEvent), 2) && anty.ah(un.k(keyEvent), un.h(111))) {
                this.c.b(java.lang.Boolean.FALSE);
                bwjVar.b();
                return java.lang.Boolean.TRUE;
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
