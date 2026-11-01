package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apqm implements defpackage.apqc {
    public final java.net.Socket a;
    public final java.util.concurrent.atomic.AtomicInteger b;
    public final defpackage.apqd c;
    public final defpackage.apqb d;

    public apqm(java.net.Socket socket) {
        if (socket == null) {
            defpackage.aooh.i("socket");
        }
        this.a = socket;
        this.b = new java.util.concurrent.atomic.AtomicInteger();
        this.c = new defpackage.apql(this);
        this.d = new defpackage.apqk(this);
    }

    @Override // defpackage.apqc
    public final defpackage.apqb a() {
        return this.d;
    }

    @Override // defpackage.apqc
    public final defpackage.apqd b() {
        return this.c;
    }

    public final java.lang.String toString() {
        java.lang.String string = this.a.toString();
        defpackage.aooh.e(string, "toString(...)");
        return string;
    }
}
