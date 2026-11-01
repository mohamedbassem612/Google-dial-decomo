package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class lyh extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.lyi a;

    public lyh(defpackage.lyi lyiVar) {
        j$.util.Objects.requireNonNull(lyiVar);
        this.a = lyiVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        ahvr.ci(action);
        if (action.equals("coalesced_rows_for_conversation_history_updated")) {
            defpackage.lyi lyiVar = this.a;
            ahok ahokVarF = lyiVar.s.f(325, "Broadcast to ConversationHistoryCallDetailsFragmentPeer.CoalescedRowsUpdatedReceiver");
            try {
                defpackage.lyi.a.b().l("com/android/dialer/conversationhistorycalldetails/ConversationHistoryCallDetailsFragmentPeer$CoalescedRowsUpdatedReceiver", "onReceive", 1390, "ConversationHistoryCallDetailsFragmentPeer.java").v("coalesced rows updated");
                defpackage.lzt lztVar = lyiVar.e;
                ajcq ajcqVarH = lztVar.g.h(new defpackage.ibg(lztVar, 15), lztVar.b);
                aooh.e(ajcqVarH, "submitAsync(...)");
                ahvr.J(ajcqVarH, lyiVar.B, lyiVar.t);
                ahokVarF.close();
            } catch (java.lang.Throwable th) {
                try {
                    ahokVarF.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
