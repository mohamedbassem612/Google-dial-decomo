package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zyn {
    public static final aaif a = new aaif("GoogleSignInCommon", new java.lang.String[0]);

    public static void a(android.content.Context context) {
        defpackage.zyo.a(context).b();
        java.util.Iterator it = aade.a().iterator();
        if (it.hasNext()) {
            throw new java.lang.UnsupportedOperationException();
        }
        synchronized (aaet.c) {
            aaet aaetVar = aaet.d;
            if (aaetVar != null) {
                aaetVar.k.incrementAndGet();
                android.os.Handler handler = aaetVar.r;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }
}
