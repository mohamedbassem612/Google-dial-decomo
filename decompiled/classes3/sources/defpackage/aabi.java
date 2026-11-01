package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class aabi {
    public final int a;
    public final int b;
    public final android.os.Bundle c;
    public final zzx d = new zzx((char[]) null);

    public aabi(int i, int i2, android.os.Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    public abstract void a(android.os.Bundle bundle);

    public abstract boolean b();

    public final void c(defpackage.aabj aabjVar) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            android.util.Log.d("MessengerIpcClient", a.bK(aabjVar, this, "Failing ", " with "));
        }
        this.d.h(aabjVar);
    }

    final void d(java.lang.Object obj) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            android.util.Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + java.lang.String.valueOf(obj));
        }
        this.d.i(obj);
    }

    public final java.lang.String toString() {
        return "Request { what=" + this.b + " id=" + this.a + " oneWay=" + b() + '}';
    }
}
