package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ill extends aomh implements aono {
    private final /* synthetic */ int $cid;
    int a;
    /* synthetic */ java.lang.Object b;
    private /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ill(aoln aolnVar, int i) {
        super(3, aolnVar);
        this.$cid = i;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.ill illVar = new defpackage.ill((aoln) obj3, 0);
            illVar.c = (ils) obj;
            illVar.b = (j$.util.Optional) obj2;
            return illVar.b(aojh.a);
        }
        if (i == 1) {
            defpackage.ill illVar2 = new defpackage.ill((aoln) obj3, 1, (byte[]) null);
            illVar2.c = (aoxi) obj;
            illVar2.b = (java.lang.Object[]) obj2;
            return illVar2.b(aojh.a);
        }
        if (i == 2) {
            defpackage.ill illVar3 = new defpackage.ill((aoln) obj3, 2, (char[]) null);
            illVar3.c = (aoxi) obj;
            illVar3.b = (java.lang.Throwable) obj2;
            return illVar3.b(aojh.a);
        }
        if (i != 3) {
            defpackage.ill illVar4 = new defpackage.ill((aoln) obj3, 4, (int[]) null);
            illVar4.c = (aoxi) obj;
            illVar4.b = (xmq) obj2;
            return illVar4.b(aojh.a);
        }
        defpackage.ill illVar5 = new defpackage.ill((aoln) obj3, 3, (short[]) null);
        illVar5.c = (aoxi) obj;
        illVar5.b = (java.lang.Object[]) obj2;
        return illVar5.b(aojh.a);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [ihn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [aoxi, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.hgt hgtVar;
        java.lang.Object obj2;
        int i = this.$cid;
        if (i == 0) {
            aolu aoluVar = aolu.a;
            int i2 = this.a;
            aooc.af(obj);
            if (i2 == 0) {
                java.lang.Object obj3 = this.c;
                this.c = null;
                this.a = 1;
                ils ilsVar = (ils) obj3;
                ?? r8 = ilsVar.b;
                java.lang.Object obj4 = ilsVar.a;
                java.lang.Object objE = r8.e();
                if (objE != aoluVar) {
                    objE = aojh.a;
                }
                if (objE == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        if (i == 1) {
            aolu aoluVar2 = aolu.a;
            int i3 = this.a;
            aooc.af(obj);
            if (i3 == 0) {
                ?? r9 = this.c;
                defpackage.hgt[] hgtVarArr = (defpackage.hgt[]) this.b;
                int length = hgtVarArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        hgtVar = null;
                        break;
                    }
                    hgtVar = hgtVarArr[i4];
                    if (!aooh.n(hgtVar, defpackage.gvm.a)) {
                        break;
                    }
                    i4++;
                }
                if (hgtVar == null) {
                    hgtVar = defpackage.gvm.a;
                }
                this.c = null;
                this.b = null;
                this.a = 1;
                if (r9.a(hgtVar, this) == aoluVar2) {
                    return aoluVar2;
                }
            }
            return aojh.a;
        }
        if (i == 2) {
            aolu aoluVar3 = aolu.a;
            int i5 = this.a;
            aooc.af(obj);
            if (i5 == 0) {
                ?? r10 = this.c;
                java.lang.Object obj5 = this.b;
                if (obj5 instanceof java.util.concurrent.CancellationException) {
                    throw ((java.lang.Throwable) obj5);
                }
                defpackage.lvx.a.b().k((java.lang.Throwable) obj5).l("com/android/dialer/contactsearch/ContactSearchDataSource", "contactChanges$<anonymous>", 57, "ContactsSearchDataSource.kt").v("Error in content resolver");
                aojh aojhVar = aojh.a;
                this.c = null;
                this.a = 1;
                if (r10.a(aojhVar, this) == aoluVar3) {
                    return aoluVar3;
                }
            }
            return aojh.a;
        }
        if (i == 3) {
            aolu aoluVar4 = aolu.a;
            int i6 = this.a;
            aooc.af(obj);
            if (i6 == 0) {
                ?? r11 = this.c;
                java.util.List listCU = ajsz.cU((tgh[]) this.b);
                this.a = 1;
                if (r11.a(listCU, this) == aoluVar4) {
                    return aoluVar4;
                }
            }
            return aojh.a;
        }
        aolu aoluVar5 = aolu.a;
        if (this.a != 0) {
            obj2 = (xmq) this.c;
            aooc.af(obj);
        } else {
            aooc.af(obj);
            aoxi aoxiVar = (aoxi) this.c;
            java.lang.Object obj6 = this.b;
            this.c = obj6;
            this.a = 1;
            if (aoxiVar.a(obj6, this) == aoluVar5) {
                return aoluVar5;
            }
            obj2 = obj6;
        }
        return java.lang.Boolean.valueOf(!(obj2 instanceof xmk));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ill(aoln aolnVar, int i, byte[] bArr) {
        super(3, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ill(aoln aolnVar, int i, char[] cArr) {
        super(3, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ill(aoln aolnVar, int i, int[] iArr) {
        super(3, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ill(aoln aolnVar, int i, short[] sArr) {
        super(3, aolnVar);
        this.$cid = i;
    }
}
