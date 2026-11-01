package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afgj extends android.content.BroadcastReceiver {
    public final ajdd a = new ajdd();
    public final java.util.Set b;
    public final java.lang.Object c;

    public afgj(java.util.Set set) {
        java.util.HashSet hashSet = new java.util.HashSet();
        this.b = hashSet;
        this.c = new java.lang.Object();
        hashSet.addAll(set);
        a();
    }

    private final void a() {
        synchronized (this.c) {
            if (this.b.isEmpty()) {
                this.a.o((java.lang.Object) null);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String strCo = ahvr.co(intent.getPackage());
        synchronized (this.c) {
            this.b.remove(strCo);
        }
        a();
    }
}
