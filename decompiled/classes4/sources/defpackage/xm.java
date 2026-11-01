package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class xm {
    public int a;

    public xm() {
        this.a = 100;
    }

    public final int a() {
        int i = this.a - 1;
        this.a = i;
        return i;
    }

    public final boolean b(int i) {
        return this.a >= i;
    }

    public final void c(boolean z) {
        this.a = (this.a * 31) + (z ? 1 : 0);
    }

    public final void d(java.lang.Object obj) {
        this.a = (this.a * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final boolean e() {
        return this.a > 0;
    }

    public final int f(aigf aigfVar, int i, int i2, amiv amivVar) {
        if ((amivVar.c == 6 ? (amix) amivVar.d : amix.a).g.size() != 0) {
            loop0: for (defpackage.amiw amiwVar : (amivVar.c == 6 ? (amix) amivVar.d : amix.a).g) {
                java.util.Iterator it = amiwVar.b.iterator();
                while (it.hasNext()) {
                    if (((java.lang.Integer) it.next()).intValue() == i2) {
                        defpackage.amho amhoVar = amiwVar.c;
                        if (amhoVar == null) {
                            amhoVar = defpackage.amho.a;
                        }
                        int iW = a.W(amhoVar.b);
                        if (iW == 0) {
                            iW = 1;
                        }
                        int i3 = iW - 2;
                        if (i3 == 2) {
                            defpackage.amho amhoVar2 = amiwVar.c;
                            if (amhoVar2 == null) {
                                amhoVar2 = defpackage.amho.a;
                            }
                            if (!aigfVar.containsKey(amhoVar2.c)) {
                                break loop0;
                            }
                            defpackage.amho amhoVar3 = amiwVar.c;
                            if (amhoVar3 == null) {
                                amhoVar3 = defpackage.amho.a;
                            }
                            this.a = ((java.lang.Integer) aigfVar.get(amhoVar3.c)).intValue();
                            break loop0;
                        }
                        if (i3 != 3) {
                            break loop0;
                        }
                        this.a = i + 1;
                        break loop0;
                    }
                }
            }
        }
        return this.a;
    }

    public xm(byte[] bArr) {
        this.a = 1;
    }

    public xm(char[] cArr) {
        this.a = 0;
    }

    public xm(char[] cArr, byte[] bArr) {
        this.a = -1;
    }

    public xm(short[] sArr) {
    }
}
