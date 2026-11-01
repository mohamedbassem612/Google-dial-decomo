package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class aaft implements defpackage.aafu {
    protected final com.google.android.gms.common.data.DataHolder a;

    protected aaft(com.google.android.gms.common.data.DataHolder dataHolder) {
        this.a = dataHolder;
    }

    public final void a() {
        com.google.android.gms.common.data.DataHolder dataHolder = this.a;
        if (dataHolder != null) {
            dataHolder.e();
        }
    }

    @Override // defpackage.aafu
    public int c() {
        com.google.android.gms.common.data.DataHolder dataHolder = this.a;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.h;
    }

    @Override // defpackage.aafu, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.aafv(this);
    }
}
