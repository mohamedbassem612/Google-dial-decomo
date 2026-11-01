package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aaxy extends defpackage.aaxt {
    private final java.util.List a;

    public aaxy(aaec aaecVar, java.util.List list) {
        super(aaecVar);
        this.a = list;
    }

    @Override // defpackage.aaxj
    public final void f(com.google.android.gms.wearable.internal.PutDataResponse putDataResponse) {
        int i = putDataResponse.a;
        i(new defpackage.aaxc(aaoo.E(i), putDataResponse.b, 0));
        if (i != 0) {
            java.util.Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((java.util.concurrent.FutureTask) it.next()).cancel(true);
            }
        }
    }
}
