package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xwe {
    public boolean a;
    public boolean b;
    public boolean c;

    private final boolean f() {
        return (this.c || this.b) && this.a;
    }

    final synchronized void a() {
        this.b = false;
        this.a = false;
        this.c = false;
    }

    final synchronized boolean b() {
        this.b = true;
        return f();
    }

    final synchronized boolean c() {
        this.c = true;
        return f();
    }

    final synchronized boolean d() {
        this.a = true;
        return f();
    }

    public final fan e() {
        if (this.b || !(this.c || this.a)) {
            return new fan(this);
        }
        throw new java.lang.IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
