package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acxk {
    public boolean a;
    public byte b;
    public java.lang.Object c;

    public final defpackage.acxm a() {
        if (this.c == null) {
            this.c = aikn.a;
        }
        if (this.b == 1) {
            return new defpackage.acxm(this.a, (aihd) this.c);
        }
        throw new java.lang.IllegalStateException("Missing required properties: requireUnmeteredNetwork");
    }

    public final void b(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final void c(java.util.Set set) {
        this.c = aihd.o(set);
    }

    public final void d(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final defpackage.qiy e() {
        int i = ~this.b;
        if ((i & 1) != 0) {
            throw new java.lang.IllegalStateException("Missing required properties: usesChronometer");
        }
        boolean z = this.a;
        java.lang.Object obj = this.c;
        if ((i & 2) != 0) {
            obj = null;
        }
        return new defpackage.qiy(z, (java.lang.Long) obj);
    }

    public final void f(boolean z) {
        this.a = z;
        this.b = (byte) (this.b | 1);
    }

    public final void g(java.lang.Long l) {
        this.c = l;
        this.b = (byte) (this.b | 2);
    }
}
