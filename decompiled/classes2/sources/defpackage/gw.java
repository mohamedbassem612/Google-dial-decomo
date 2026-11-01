package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gw extends defpackage.gc {
    final /* synthetic */ hb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw(hb hbVar, android.content.Context context, defpackage.gm gmVar, android.view.View view) {
        super(context, gmVar, view, false, 2130968611, 0);
        this.d = hbVar;
        if (!gmVar.l.o()) {
            android.view.View view2 = hbVar.h;
            this.a = view2 == null ? (android.view.View) hbVar.f : view2;
        }
        e(hbVar.l);
    }

    @Override // defpackage.gc
    public final void c() {
        hb hbVar = this.d;
        hbVar.k = null;
        hbVar.m = 0;
        super.c();
    }
}
