package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ymo implements defpackage.yng {
    final /* synthetic */ defpackage.yng a;
    final /* synthetic */ java.lang.AutoCloseable b;

    public ymo(defpackage.ymr ymrVar, defpackage.yng yngVar, java.lang.AutoCloseable autoCloseable) {
        this.a = yngVar;
        this.b = autoCloseable;
        j$.util.Objects.requireNonNull(ymrVar);
    }

    @Override // defpackage.yng
    public final void a(int i) {
        throw null;
    }

    @Override // defpackage.yng
    public final void b(int i, com.google.android.apps.aicore.aidl.AiCoreException aiCoreException) {
        try {
            this.a.b(i, aiCoreException);
        } finally {
            defpackage.xhp.s(this.b);
        }
    }

    @Override // defpackage.yng
    public final void c(java.lang.Object obj) {
        try {
            this.a.c(obj);
        } finally {
            defpackage.xhp.s(this.b);
        }
    }
}
