package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aka implements ajg {
    public final aogy a;

    public aka(aogy aogyVar) {
        this.a = aogyVar;
    }

    /* JADX WARN: Type inference failed for: r2v19, types: [aonj, java.lang.Object] */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final defpackage.aly b(nf nfVar) {
        int[] iArr;
        java.lang.Object[] objArr;
        long[] jArr;
        int i;
        aogy aogyVar = this.a;
        aco acoVar = (aco) aogyVar.b;
        acm acmVar = new acm(acoVar.e + 2);
        aco acoVar2 = new aco(acoVar.e);
        int[] iArr2 = acoVar.b;
        java.lang.Object[] objArr2 = acoVar.c;
        long[] jArr2 = acoVar.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((j & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            int i6 = iArr2[i5];
                            defpackage.ajz ajzVar = (defpackage.ajz) objArr2[i5];
                            acmVar.f(i6);
                            aiw aiwVar = (aiw) nfVar.a.a(ajzVar.a);
                            ajh ajhVar = ajzVar.b;
                            int i7 = ajzVar.c;
                            acoVar2.g(i6, new defpackage.alx(aiwVar, ajhVar));
                        }
                        j >>= 8;
                        i4++;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                        jArr2 = jArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    jArr = jArr2;
                    if (i != 8) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                    jArr = jArr2;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr2 = iArr;
                objArr2 = objArr;
                jArr2 = jArr;
            }
        }
        if (!acoVar.b(0)) {
            if (acmVar.b < 0) {
                un.c("Index must be between 0 and size");
            }
            acmVar.c(acmVar.b + 1);
            int[] iArr3 = acmVar.a;
            int i8 = acmVar.b;
            if (i8 != 0) {
                ajsz.db(iArr3, iArr3, 1, 0, i8);
            }
            iArr3[0] = 0;
            acmVar.b++;
        }
        if (!acoVar.b(aogyVar.a)) {
            acmVar.f(aogyVar.a);
        }
        acmVar.e();
        return new defpackage.aly(acmVar, acoVar2, aogyVar.a, ajk.d, 0);
    }
}
