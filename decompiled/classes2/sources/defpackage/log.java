package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class log extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.loi a;

    public log(defpackage.loi loiVar) {
        this.a = loiVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        aooh.f(context, "context");
        aooh.f(intent, "intent");
        defpackage.loi loiVar = this.a;
        ahok ahokVarF = loiVar.k.f(311, "Broadcast to ChocolateChipFragmentPeer.readContactsPermissionGrantedReceiver");
        try {
            android.view.View view = ((aw) loiVar.d).Q;
            if (view != null) {
                android.support.v7.widget.RecyclerView recyclerViewFindViewById = view.findViewById(2131428773);
                kh khVar = recyclerViewFindViewById.m;
                defpackage.lom lomVar = khVar instanceof defpackage.lom ? (defpackage.lom) khVar : null;
                if (lomVar != null) {
                    android.support.v7.widget.LinearLayoutManager linearLayoutManager = recyclerViewFindViewById.n;
                    android.support.v7.widget.LinearLayoutManager linearLayoutManager2 = linearLayoutManager instanceof android.support.v7.widget.LinearLayoutManager ? linearLayoutManager : null;
                    if (linearLayoutManager2 != null) {
                        com.android.dialer.chocolatechip.impl.ui.FastScroller fastScroller = (com.android.dialer.chocolatechip.impl.ui.FastScroller) view.findViewById(2131428240);
                        loiVar.p = lomVar;
                        loiVar.o = linearLayoutManager2;
                        loiVar.c();
                        view.findViewById(2131428110).setVisibility(8);
                        recyclerViewFindViewById.setVisibility(0);
                        fastScroller.b(lomVar, linearLayoutManager2);
                    }
                }
            }
            ajsz.ak(ahokVarF, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }
}
