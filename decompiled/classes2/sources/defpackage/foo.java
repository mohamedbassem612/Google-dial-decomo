package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class foo extends defpackage.foj {
    public final java.lang.String a;
    public final aify b;

    public foo(java.lang.String str, java.lang.String str2, java.util.List list) {
        super(str);
        ahvr.bM(!list.isEmpty());
        this.a = str2;
        aify aifyVarN = aify.n(list);
        this.b = aifyVarN;
    }

    private static java.util.List d(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(5, 7))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (java.lang.NumberFormatException unused) {
            return new java.util.ArrayList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:94:0x01b5 A[Catch: NumberFormatException | StringIndexOutOfBoundsException -> 0x0254, TryCatch #0 {NumberFormatException | StringIndexOutOfBoundsException -> 0x0254, blocks: (B:79:0x015d, B:92:0x01ac, B:94:0x01b5, B:95:0x01bf, B:18:0x004f, B:20:0x0058, B:21:0x0062, B:108:0x0209), top: B:118:0x000e }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.foj, defpackage.eqx
    public final void b(defpackage.eqv eqvVar) {
        java.lang.Integer numValueOf;
        java.lang.String str = this.f;
        try {
            switch (str.hashCode()) {
                case 82815:
                    if (!str.equals("TAL")) {
                    }
                    eqvVar.c = (java.lang.CharSequence) this.b.get(0);
                    break;
                case 82878:
                    if (!str.equals("TCM")) {
                    }
                    eqvVar.s = (java.lang.CharSequence) this.b.get(0);
                    break;
                case 82897:
                    if (!str.equals("TDA")) {
                    }
                    java.lang.String str2 = (java.lang.String) this.b.get(0);
                    int i = java.lang.Integer.parseInt(str2.substring(2, 4));
                    int i2 = java.lang.Integer.parseInt(str2.substring(0, 2));
                    eqvVar.m = java.lang.Integer.valueOf(i);
                    eqvVar.n = java.lang.Integer.valueOf(i2);
                    break;
                case 83253:
                    if (!str.equals("TP1")) {
                    }
                    eqvVar.b = (java.lang.CharSequence) this.b.get(0);
                    break;
                case 83254:
                    if (!str.equals("TP2")) {
                    }
                    eqvVar.d = (java.lang.CharSequence) this.b.get(0);
                    break;
                case 83255:
                    if (!str.equals("TP3")) {
                    }
                    eqvVar.t = (java.lang.CharSequence) this.b.get(0);
                    break;
                case 83341:
                    if (!str.equals("TRK")) {
                    }
                    java.lang.String str3 = (java.lang.String) this.b.get(0);
                    java.lang.String str4 = eum.a;
                    java.lang.String[] strArrSplit = str3.split("/", -1);
                    int i3 = java.lang.Integer.parseInt(strArrSplit[0]);
                    numValueOf = strArrSplit.length > 1 ? java.lang.Integer.valueOf(java.lang.Integer.parseInt(strArrSplit[1])) : null;
                    eqvVar.h = java.lang.Integer.valueOf(i3);
                    eqvVar.i = numValueOf;
                    break;
                case 83378:
                    if (!str.equals("TT2")) {
                    }
                    eqvVar.a = (java.lang.CharSequence) this.b.get(0);
                    break;
                case 83536:
                    if (!str.equals("TXT")) {
                    }
                    eqvVar.r = (java.lang.CharSequence) this.b.get(0);
                    break;
                case 83552:
                    if (!str.equals("TYE")) {
                    }
                    eqvVar.l = java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) this.b.get(0)));
                    break;
                case 2567331:
                    if (!str.equals("TALB")) {
                    }
                    eqvVar.c = (java.lang.CharSequence) this.b.get(0);
                    break;
                case 2569357:
                    if (!str.equals("TCOM")) {
                    }
                    eqvVar.s = (java.lang.CharSequence) this.b.get(0);
                    break;
                case 2569358:
                    if (str.equals("TCON")) {
                        aify aifyVar = this.b;
                        java.lang.Integer numX = aiql.X((java.lang.String) aifyVar.get(0));
                        if (numX != null) {
                            java.lang.String strA = defpackage.fok.a(numX.intValue());
                            if (strA != null) {
                                eqvVar.x = strA;
                            }
                        } else {
                            eqvVar.x = (java.lang.CharSequence) aifyVar.get(0);
                        }
                    }
                    break;
                case 2569891:
                    if (!str.equals("TDAT")) {
                    }
                    java.lang.String str5 = (java.lang.String) this.b.get(0);
                    int i4 = java.lang.Integer.parseInt(str5.substring(2, 4));
                    int i5 = java.lang.Integer.parseInt(str5.substring(0, 2));
                    eqvVar.m = java.lang.Integer.valueOf(i4);
                    eqvVar.n = java.lang.Integer.valueOf(i5);
                    break;
                case 2570401:
                    if (str.equals("TDRC")) {
                        java.util.List listD = d((java.lang.String) this.b.get(0));
                        int size = listD.size();
                        if (size != 1) {
                            if (size != 2) {
                                if (size == 3) {
                                    eqvVar.n = (java.lang.Integer) listD.get(2);
                                }
                            }
                            eqvVar.m = (java.lang.Integer) listD.get(1);
                        }
                        eqvVar.l = (java.lang.Integer) listD.get(0);
                    }
                    break;
                case 2570410:
                    if (str.equals("TDRL")) {
                        java.util.List listD2 = d((java.lang.String) this.b.get(0));
                        int size2 = listD2.size();
                        if (size2 != 1) {
                            if (size2 != 2) {
                                if (size2 == 3) {
                                    eqvVar.q = (java.lang.Integer) listD2.get(2);
                                }
                            }
                            eqvVar.p = (java.lang.Integer) listD2.get(1);
                        }
                        eqvVar.o = (java.lang.Integer) listD2.get(0);
                    }
                    break;
                case 2571565:
                    if (!str.equals("TEXT")) {
                    }
                    eqvVar.r = (java.lang.CharSequence) this.b.get(0);
                    break;
                case 2575251:
                    if (!str.equals("TIT2")) {
                    }
                    eqvVar.a = (java.lang.CharSequence) this.b.get(0);
                    break;
                case 2581512:
                    if (!str.equals("TPE1")) {
                    }
                    eqvVar.b = (java.lang.CharSequence) this.b.get(0);
                    break;
                case 2581513:
                    if (!str.equals("TPE2")) {
                    }
                    eqvVar.d = (java.lang.CharSequence) this.b.get(0);
                    break;
                case 2581514:
                    if (!str.equals("TPE3")) {
                    }
                    eqvVar.t = (java.lang.CharSequence) this.b.get(0);
                    break;
                case 2581856:
                    if (str.equals("TPOS")) {
                        java.lang.String str6 = (java.lang.String) this.b.get(0);
                        java.lang.String str7 = eum.a;
                        java.lang.String[] strArrSplit2 = str6.split("/", -1);
                        int i6 = java.lang.Integer.parseInt(strArrSplit2[0]);
                        numValueOf = strArrSplit2.length > 1 ? java.lang.Integer.valueOf(java.lang.Integer.parseInt(strArrSplit2[1])) : null;
                        eqvVar.v = java.lang.Integer.valueOf(i6);
                        eqvVar.w = numValueOf;
                    }
                    break;
                case 2583398:
                    if (!str.equals("TRCK")) {
                    }
                    java.lang.String str8 = (java.lang.String) this.b.get(0);
                    java.lang.String str9 = eum.a;
                    java.lang.String[] strArrSplit3 = str8.split("/", -1);
                    int i7 = java.lang.Integer.parseInt(strArrSplit3[0]);
                    if (strArrSplit3.length > 1) {
                    }
                    eqvVar.h = java.lang.Integer.valueOf(i7);
                    eqvVar.i = numValueOf;
                    break;
                case 2584864:
                    if (str.equals("TSST")) {
                        eqvVar.u = (java.lang.CharSequence) this.b.get(0);
                    }
                    break;
                case 2590194:
                    if (!str.equals("TYER")) {
                    }
                    eqvVar.l = java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) this.b.get(0)));
                    break;
            }
        } catch (java.lang.NumberFormatException | java.lang.StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.foo fooVar = (defpackage.foo) obj;
            if (j$.util.Objects.equals(this.f, fooVar.f) && j$.util.Objects.equals(this.a, fooVar.a) && ahvr.aP(this.b, fooVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f.hashCode() + 527;
        java.lang.String str = this.a;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.b.hashCode();
    }

    @Override // defpackage.foj
    public final java.lang.String toString() {
        return this.f + ": description=" + this.a + ": values=" + java.lang.String.valueOf(this.b);
    }
}
