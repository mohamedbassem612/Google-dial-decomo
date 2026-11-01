package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vxd implements android.content.DialogInterface.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ vxd(jxe jxeVar, android.content.Context context, android.content.Intent intent, int i) {
        this.$cid = i;
        this.b = jxeVar;
        this.c = context;
        this.a = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        if (this.$cid != 0) {
            java.lang.Object obj = this.a;
            ((jxe) this.b).b((android.content.Context) this.c, (android.content.Intent) obj);
            return;
        }
        ?? r3 = this.b;
        defpackage.vxq vxqVar = (defpackage.vxq) this.a;
        vxqVar.g(r3);
        vxqVar.N = false;
        vxqVar.O.clear();
        vxqVar.m.n(rmw.bm);
        ((android.view.ActionMode) vxqVar.J.orElseThrow()).finish();
        if (((android.widget.CheckBox) ((android.view.View) this.c).findViewById(2131428030)).isChecked()) {
            agtj agtjVar = vxqVar.i;
            defpackage.voc vocVar = vxqVar.Z;
            agtjVar.j(defpackage.zoe.N(((afhf) vocVar.b).a(new vrx(9), (java.util.concurrent.Executor) vocVar.a)), new defpackage.zoe("Failed to update do not show again preference"), vxqVar.s);
        }
    }

    public /* synthetic */ vxd(defpackage.vxq vxqVar, java.util.List list, android.view.View view, int i) {
        this.$cid = i;
        this.a = vxqVar;
        this.b = list;
        this.c = view;
    }
}
