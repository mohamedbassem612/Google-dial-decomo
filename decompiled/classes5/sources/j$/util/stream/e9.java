package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class e9 extends j$.util.stream.x7 {
    @Override // j$.util.stream.x7
    public final void d() {
        j$.util.stream.q7 q7Var = new j$.util.stream.q7();
        this.h = q7Var;
        j$.util.Objects.requireNonNull(q7Var);
        this.e = this.b.P(new j$.util.stream.d9(q7Var, (byte) 0));
        this.f = new j$.desugar.sun.nio.fs.g((byte) 17, this);
    }

    @Override // j$.util.stream.x7
    public final j$.util.stream.x7 e(j$.util.Spliterator spliterator) {
        return new j$.util.stream.e9(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        j$.util.Objects.requireNonNull(consumer);
        c();
        j$.util.Objects.requireNonNull(consumer);
        j$.util.stream.d9 d9Var = new j$.util.stream.d9(consumer, (byte) 1);
        this.b.O(this.d, d9Var);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        java.lang.Object obj;
        j$.util.Objects.requireNonNull(consumer);
        boolean zA = a();
        if (zA) {
            j$.util.stream.q7 q7Var = (j$.util.stream.q7) this.h;
            long j = this.g;
            if (q7Var.c != 0) {
                if (j >= q7Var.count()) {
                    throw new java.lang.IndexOutOfBoundsException(java.lang.Long.toString(j));
                }
                for (int i = 0; i <= q7Var.c; i++) {
                    long j2 = q7Var.d[i];
                    java.lang.Object[] objArr = q7Var.f[i];
                    if (j < ((long) objArr.length) + j2) {
                        obj = objArr[(int) (j - j2)];
                    }
                }
                throw new java.lang.IndexOutOfBoundsException(java.lang.Long.toString(j));
            }
            if (j >= q7Var.b) {
                throw new java.lang.IndexOutOfBoundsException(java.lang.Long.toString(j));
            }
            obj = q7Var.e[(int) j];
            consumer.r(obj);
        }
        return zA;
    }
}
