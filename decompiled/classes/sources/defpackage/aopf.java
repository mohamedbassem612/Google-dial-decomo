package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aopf extends defpackage.aopk {
    @Override // defpackage.aopk
    public final long a() {
        return b().nextLong();
    }

    public abstract java.util.Random b();

    @Override // defpackage.aopk
    public final int c() {
        return b().nextInt(2147418112);
    }
}
