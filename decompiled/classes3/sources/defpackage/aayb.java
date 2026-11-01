package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aayb implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public aayb(defpackage.aayc aaycVar, android.os.ParcelFileDescriptor parcelFileDescriptor, byte[] bArr, int i) {
        this.$cid = i;
        this.a = parcelFileDescriptor;
        this.b = bArr;
        j$.util.Objects.requireNonNull(aaycVar);
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.Object call() {
        if (this.$cid != 0) {
            akzx akzxVar = ((defpackage.wjb) this.a).c;
            akzxVar.u();
            aiyr aiyrVar = akzxVar.b;
            aiyr aiyrVar2 = aiyr.a;
            java.lang.Object obj = this.b;
            j$.util.Objects.requireNonNull(obj);
            aiyrVar.b |= 1;
            aiyrVar.c = (java.lang.String) obj;
            return null;
        }
        if (android.util.Log.isLoggable("WearableClient", 3)) {
            android.util.Log.d("WearableClient", "processAssets: writing data to FD : ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.a))));
        }
        java.lang.Object obj2 = this.a;
        android.os.ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream((android.os.ParcelFileDescriptor) obj2);
        try {
            autoCloseOutputStream.write((byte[]) this.b);
            autoCloseOutputStream.flush();
            if (android.util.Log.isLoggable("WearableClient", 3)) {
                android.util.Log.d("WearableClient", a.bH(obj2, "processAssets: wrote data: "));
            }
            return java.lang.Boolean.TRUE;
        } catch (java.io.IOException unused) {
            android.util.Log.w("WearableClient", "processAssets: writing data failed: " + java.lang.String.valueOf(this.a));
            return java.lang.Boolean.FALSE;
        } finally {
            try {
                if (android.util.Log.isLoggable("WearableClient", 3)) {
                    android.util.Log.d("WearableClient", "processAssets: closing: " + java.lang.String.valueOf(this.a));
                }
                autoCloseOutputStream.close();
            } catch (java.io.IOException unused2) {
            }
        }
    }

    public aayb(defpackage.wjb wjbVar, java.lang.String str, int i) {
        this.$cid = i;
        this.a = wjbVar;
        this.b = str;
    }
}
