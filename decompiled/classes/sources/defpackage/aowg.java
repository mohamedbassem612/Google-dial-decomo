package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aowg {
    public static final defpackage.aown a = new defpackage.aown(-1, null, null, 0);
    public static final int b = defpackage.aosv.y("kotlinx.coroutines.bufferedChannel.segmentSize", 32, Integer.MAX_VALUE);
    public static final int c = defpackage.aosv.y("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, Integer.MAX_VALUE);
    public static final defpackage.apcm d = new defpackage.apcm("BUFFERED");
    public static final defpackage.apcm e = new defpackage.apcm("SHOULD_BUFFER");
    public static final defpackage.apcm f = new defpackage.apcm("S_RESUMING_BY_RCV");
    public static final defpackage.apcm g = new defpackage.apcm("RESUMING_BY_EB");
    public static final defpackage.apcm h = new defpackage.apcm("POISONED");
    public static final defpackage.apcm i = new defpackage.apcm("DONE_RCV");
    public static final defpackage.apcm j = new defpackage.apcm("INTERRUPTED_SEND");
    public static final defpackage.apcm k = new defpackage.apcm("INTERRUPTED_RCV");
    public static final defpackage.apcm l = new defpackage.apcm("CHANNEL_CLOSED");
    public static final defpackage.apcm m = new defpackage.apcm("SUSPEND");
    public static final defpackage.apcm n = new defpackage.apcm("SUSPEND_NO_WAITER");
    public static final defpackage.apcm o = new defpackage.apcm("FAILED");
    public static final defpackage.apcm p = new defpackage.apcm("NO_RECEIVE_RESULT");
    public static final defpackage.apcm q = new defpackage.apcm("CLOSE_HANDLER_CLOSED");
    public static final defpackage.apcm r = new defpackage.apcm("CLOSE_HANDLER_INVOKED");
    public static final defpackage.apcm s = new defpackage.apcm("NO_CLOSE_CAUSE");

    public static final boolean a(defpackage.aosb aosbVar, java.lang.Object obj, defpackage.aono aonoVar) {
        java.lang.Object objJ = aosbVar.j(obj, aonoVar);
        if (objJ == null) {
            return false;
        }
        aosbVar.c(objJ);
        return true;
    }
}
