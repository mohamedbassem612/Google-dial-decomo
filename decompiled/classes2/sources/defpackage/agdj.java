package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class agdj implements android.widget.AdapterView.OnItemClickListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public agdj(agdl agdlVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(agdlVar);
        this.a = agdlVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        java.lang.Object item;
        if (this.$cid != 0) {
            java.lang.Object obj = this.a;
            defpackage.ic icVar = (defpackage.ic) obj;
            defpackage.ie ieVar = icVar.d;
            ieVar.setSelection(i);
            if (ieVar.getOnItemClickListener() != null) {
                ieVar.performItemClick(view, i, icVar.b.getItemId(i));
            }
            ((defpackage.jv) obj).m();
            return;
        }
        java.lang.Object obj2 = this.a;
        if (i < 0) {
            defpackage.jv jvVar = ((agdl) obj2).a;
            item = !jvVar.x() ? null : jvVar.e.getSelectedItem();
        } else {
            item = ((agdl) obj2).getAdapter().getItem(i);
        }
        agdl agdlVar = (agdl) this.a;
        agdlVar.setText(agdl.a(agdlVar, item), false);
        android.widget.AdapterView.OnItemClickListener onItemClickListener = agdlVar.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                defpackage.jv jvVar2 = agdlVar.a;
                view = !jvVar2.x() ? null : jvVar2.e.getSelectedView();
                i = jvVar2.o();
                j = !jvVar2.x() ? Long.MIN_VALUE : jvVar2.e.getSelectedItemId();
            }
            onItemClickListener.onItemClick(agdlVar.a.e, view, i, j);
        }
        agdlVar.a.m();
    }

    public agdj(defpackage.ic icVar, int i) {
        this.$cid = i;
        this.a = icVar;
    }
}
