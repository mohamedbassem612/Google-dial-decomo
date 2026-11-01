package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ese {
    public final aify a;
    public final java.util.List b = new java.util.ArrayList();
    public java.nio.ByteBuffer[] c = new java.nio.ByteBuffer[0];
    public defpackage.esf d;
    public boolean e;

    public ese(aify aifyVar) {
        this.a = aifyVar;
        defpackage.esf esfVar = defpackage.esf.a;
        this.d = defpackage.esf.a;
        this.e = false;
    }

    public final int a() {
        return this.c.length - 1;
    }

    public final java.nio.ByteBuffer b() {
        if (!e()) {
            return defpackage.esj.a;
        }
        java.nio.ByteBuffer byteBuffer = this.c[a()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        c(defpackage.esj.a);
        return this.c[a()];
    }

    public final void c(java.nio.ByteBuffer byteBuffer) {
        boolean z;
        do {
            z = false;
            for (int i = 0; i <= a(); i++) {
                if (!this.c[i].hasRemaining()) {
                    java.util.List list = this.b;
                    defpackage.esj esjVar = (defpackage.esj) list.get(i);
                    if (!esjVar.h()) {
                        java.nio.ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : defpackage.esj.a;
                        long jRemaining = byteBuffer2.remaining();
                        esjVar.e(byteBuffer2);
                        this.c[i] = esjVar.c();
                        boolean z2 = true;
                        if (jRemaining - ((long) byteBuffer2.remaining()) <= 0 && !this.c[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.c[i].hasRemaining() && i < a()) {
                        ((defpackage.esj) list.get(i + 1)).d();
                    }
                }
            }
        } while (z);
    }

    public final boolean d() {
        return this.e && ((defpackage.esj) this.b.get(a())).h() && !this.c[a()].hasRemaining();
    }

    public final boolean e() {
        return !this.b.isEmpty();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ese) {
            aike aikeVar = this.a;
            aike aikeVar2 = ((defpackage.ese) obj).a;
            int i = aikeVar2.d;
            int i2 = aikeVar.d;
            if (i2 == i) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (aikeVar.get(i3) == aikeVar2.get(i3)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
