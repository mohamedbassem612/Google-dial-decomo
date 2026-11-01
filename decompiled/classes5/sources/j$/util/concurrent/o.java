package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class o {
    public j$.util.concurrent.k[] a;
    public j$.util.concurrent.k b = null;
    public j$.util.concurrent.n c;
    public j$.util.concurrent.n d;
    public int e;
    public int f;
    public int g;
    public final int h;

    public o(j$.util.concurrent.k[] kVarArr, int i, int i2, int i3) {
        this.a = kVarArr;
        this.h = i;
        this.e = i2;
        this.f = i2;
        this.g = i3;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a A[LOOP:1: B:33:0x005d->B:37:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x005d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0006 A[EDGE_INSN: B:63:0x0006->B:60:0x0006 BREAK  A[LOOP:1: B:33:0x005d->B:37:0x006a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0006 A[EDGE_INSN: B:64:0x0006->B:60:0x0006 BREAK  A[LOOP:1: B:33:0x005d->B:37:0x006a], SYNTHETIC] */
    public final j$.util.concurrent.k a() {
        j$.util.concurrent.k[] kVarArr;
        int length;
        int i;
        j$.util.concurrent.n nVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        j$.util.concurrent.k kVar = this.b;
        if (kVar != null) {
            kVar = kVar.d;
        }
        while (kVar == null) {
            if (this.f >= this.g || (kVarArr = this.a) == null || (length = kVarArr.length) <= (i = this.e) || i < 0) {
                this.b = null;
                return null;
            }
            j$.util.concurrent.k kVarK = j$.util.concurrent.ConcurrentHashMap.k(kVarArr, i);
            if (kVarK == null || kVarK.a >= 0) {
                kVar = kVarK;
                if (this.c != null) {
                    while (true) {
                        nVar = this.c;
                        i2 = this.e;
                        if (nVar != null) {
                            i3 = i2 + this.h;
                            this.e = i3;
                            if (i3 >= length) {
                                break;
                            }
                            int i7 = this.f + 1;
                            this.f = i7;
                            this.e = i7;
                            break;
                        }
                        i4 = nVar.a;
                        i5 = i2 + i4;
                        this.e = i5;
                        if (i5 >= length) {
                            break;
                        }
                        this.e = nVar.b;
                        this.a = nVar.c;
                        nVar.c = null;
                        j$.util.concurrent.n nVar2 = nVar.d;
                        nVar.d = this.d;
                        this.c = nVar2;
                        this.d = nVar;
                        length = i4;
                    }
                } else {
                    i6 = i + this.h;
                    this.e = i6;
                    if (i6 >= length) {
                        int i8 = this.f + 1;
                        this.f = i8;
                        this.e = i8;
                    }
                }
            } else if (kVarK instanceof j$.util.concurrent.g) {
                this.a = ((j$.util.concurrent.g) kVarK).e;
                j$.util.concurrent.n nVar3 = this.d;
                if (nVar3 != null) {
                    this.d = nVar3.d;
                } else {
                    nVar3 = new j$.util.concurrent.n();
                }
                nVar3.c = kVarArr;
                nVar3.a = length;
                nVar3.b = i;
                nVar3.d = this.c;
                this.c = nVar3;
                kVar = null;
            } else {
                kVar = kVarK instanceof j$.util.concurrent.p ? ((j$.util.concurrent.p) kVarK).f : null;
                if (this.c != null) {
                    while (true) {
                        nVar = this.c;
                        i2 = this.e;
                        if (nVar != null) {
                            i3 = i2 + this.h;
                            this.e = i3;
                            if (i3 >= length) {
                                break;
                                break;
                            }
                            int i9 = this.f + 1;
                            this.f = i9;
                            this.e = i9;
                            break;
                            break;
                        }
                        i4 = nVar.a;
                        i5 = i2 + i4;
                        this.e = i5;
                        if (i5 >= length) {
                            break;
                            break;
                        }
                        this.e = nVar.b;
                        this.a = nVar.c;
                        nVar.c = null;
                        j$.util.concurrent.n nVar4 = nVar.d;
                        nVar.d = this.d;
                        this.c = nVar4;
                        this.d = nVar;
                        length = i4;
                    }
                } else {
                    i6 = i + this.h;
                    this.e = i6;
                    if (i6 >= length) {
                        int i10 = this.f + 1;
                        this.f = i10;
                        this.e = i10;
                    }
                }
            }
        }
        this.b = kVar;
        return kVar;
    }
}
