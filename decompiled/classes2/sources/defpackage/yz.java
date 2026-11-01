package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class yz {
    public java.lang.Object a;

    public /* synthetic */ yz(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cdu.c));
    }

    public final void a() {
        this.a = null;
        java.util.List list = defpackage.euh.a;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(this);
            }
        }
    }

    public final void b() {
        java.lang.Object obj = this.a;
        ahvr.ci(obj);
        ((android.os.Message) obj).sendToTarget();
        a();
    }

    public yz(ccp ccpVar) {
        this.a = ccpVar;
    }

    public yz() {
    }
}
