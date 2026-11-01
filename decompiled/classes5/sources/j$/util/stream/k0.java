package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class k0 extends j$.util.stream.b {
    public final j$.util.stream.e0 j;
    public final boolean k;

    public k0(j$.util.stream.k0 k0Var, j$.util.Spliterator spliterator) {
        super(k0Var, spliterator);
        this.k = k0Var.k;
        this.j = k0Var.j;
    }

    @Override // j$.util.stream.d
    public final java.lang.Object a() {
        j$.util.stream.a aVar = this.a;
        j$.util.stream.k9 k9Var = (j$.util.stream.k9) this.j.d.get();
        aVar.O(this.b, k9Var);
        java.lang.Object obj = k9Var.get();
        if (this.k) {
            if (obj != null) {
                if (c()) {
                    j$.com.android.tools.r8.a.H(this.h, null, obj);
                    return obj;
                }
                i();
                return obj;
            }
        } else if (obj != null) {
            j$.com.android.tools.r8.a.H(this.h, null, obj);
        }
        return null;
    }

    @Override // j$.util.stream.d
    public final j$.util.stream.d e(j$.util.Spliterator spliterator) {
        return new j$.util.stream.k0(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final java.lang.Object j() {
        return this.j.b;
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(java.util.concurrent.CountedCompleter countedCompleter) {
        if (this.k) {
            j$.util.stream.k0 k0Var = (j$.util.stream.k0) this.d;
            j$.util.stream.k0 k0Var2 = null;
            while (k0Var != k0Var2) {
                java.lang.Object objK = k0Var.k();
                if (objK != null && this.j.c.test(objK)) {
                    f(objK);
                    if (!c()) {
                        i();
                        break;
                    } else {
                        j$.com.android.tools.r8.a.H(this.h, null, objK);
                        break;
                    }
                }
                k0Var2 = k0Var;
                k0Var = (j$.util.stream.k0) this.e;
            }
        }
        super.onCompletion(countedCompleter);
    }

    public k0(j$.util.stream.e0 e0Var, boolean z, j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        super(aVar, spliterator);
        this.k = z;
        this.j = e0Var;
    }
}
