package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akzs {
    public static final defpackage.akzs a = new defpackage.akzs(null);
    final defpackage.alcb b = new defpackage.alcb();
    boolean c;
    boolean d;

    private akzs(byte[] bArr) {
        e();
        e();
    }

    public static int a(defpackage.alcr alcrVar, int i, java.lang.Object obj) {
        int iNumberOfLeadingZeros;
        int iO;
        int iNumberOfLeadingZeros2;
        int iNumberOfLeadingZeros3;
        int i2;
        int iNumberOfLeadingZeros4 = (352 - (java.lang.Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6;
        if (alcrVar == defpackage.alcr.GROUP) {
            iNumberOfLeadingZeros4 <<= 1;
        }
        defpackage.alcs alcsVar = defpackage.alcs.a;
        int iF = 4;
        switch (alcrVar.ordinal()) {
            case 0:
                ((java.lang.Double) obj).doubleValue();
                iF = 8;
                return iNumberOfLeadingZeros4 + iF;
            case 1:
                ((java.lang.Float) obj).floatValue();
                return iNumberOfLeadingZeros4 + iF;
            case 2:
                iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(((java.lang.Long) obj).longValue());
                i2 = 640 - (iNumberOfLeadingZeros * 9);
                iF = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iF;
            case 3:
                iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(((java.lang.Long) obj).longValue());
                i2 = 640 - (iNumberOfLeadingZeros * 9);
                iF = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iF;
            case 4:
                iF = defpackage.akzk.F(((java.lang.Integer) obj).intValue());
                return iNumberOfLeadingZeros4 + iF;
            case 5:
                ((java.lang.Long) obj).longValue();
                iF = 8;
                return iNumberOfLeadingZeros4 + iF;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                ((java.lang.Integer) obj).intValue();
                return iNumberOfLeadingZeros4 + iF;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ((java.lang.Boolean) obj).booleanValue();
                iF = 1;
                return iNumberOfLeadingZeros4 + iF;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                if (obj instanceof defpackage.akzc) {
                    iF = defpackage.akzk.E((defpackage.akzc) obj);
                } else {
                    iO = defpackage.ajsz.O((java.lang.String) obj);
                    iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(iO);
                    iF = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + iO;
                }
                return iNumberOfLeadingZeros4 + iF;
            case 9:
                iF = ((defpackage.albh) obj).l();
                return iNumberOfLeadingZeros4 + iF;
            case 10:
                iF = obj instanceof defpackage.alax ? ((defpackage.alax) obj).a() : defpackage.akzk.G((defpackage.albh) obj);
                return iNumberOfLeadingZeros4 + iF;
            case 11:
                if (obj instanceof defpackage.akzc) {
                    iF = defpackage.akzk.E((defpackage.akzc) obj);
                } else {
                    iO = ((byte[]) obj).length;
                    iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(iO);
                    iF = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + iO;
                }
                return iNumberOfLeadingZeros4 + iF;
            case 12:
                iNumberOfLeadingZeros3 = java.lang.Integer.numberOfLeadingZeros(((java.lang.Integer) obj).intValue());
                i2 = 352 - (iNumberOfLeadingZeros3 * 9);
                iF = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iF;
            case 13:
                iF = obj instanceof defpackage.alah ? defpackage.akzk.F(((defpackage.alah) obj).a()) : defpackage.akzk.F(((java.lang.Integer) obj).intValue());
                return iNumberOfLeadingZeros4 + iF;
            case 14:
                ((java.lang.Integer) obj).intValue();
                return iNumberOfLeadingZeros4 + iF;
            case 15:
                ((java.lang.Long) obj).longValue();
                iF = 8;
                return iNumberOfLeadingZeros4 + iF;
            case 16:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                iNumberOfLeadingZeros3 = java.lang.Integer.numberOfLeadingZeros((iIntValue << 1) ^ (iIntValue >> 31));
                i2 = 352 - (iNumberOfLeadingZeros3 * 9);
                iF = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iF;
            case 17:
                long jLongValue = ((java.lang.Long) obj).longValue();
                iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros((jLongValue << 1) ^ (jLongValue >> 63));
                i2 = 640 - (iNumberOfLeadingZeros * 9);
                iF = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iF;
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static java.lang.Object c(java.lang.Object obj) {
        if (obj instanceof defpackage.albm) {
            return ((defpackage.albm) obj).a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public static void f(defpackage.akzk akzkVar, defpackage.alcr alcrVar, int i, java.lang.Object obj) {
        if (alcrVar == defpackage.alcr.GROUP) {
            akzkVar.t(i, 3);
            ((defpackage.albh) obj).S(akzkVar);
            akzkVar.t(i, 4);
            return;
        }
        akzkVar.t(i, alcrVar.t);
        defpackage.alcs alcsVar = defpackage.alcs.a;
        switch (alcrVar.ordinal()) {
            case 0:
                akzkVar.J(((java.lang.Double) obj).doubleValue());
                break;
            case 1:
                akzkVar.L(((java.lang.Float) obj).floatValue());
                break;
            case 2:
                akzkVar.x(((java.lang.Long) obj).longValue());
                break;
            case 3:
                akzkVar.x(((java.lang.Long) obj).longValue());
                break;
            case 4:
                akzkVar.n(((java.lang.Integer) obj).intValue());
                break;
            case 5:
                akzkVar.l(((java.lang.Long) obj).longValue());
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                akzkVar.j(((java.lang.Integer) obj).intValue());
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                akzkVar.d(((java.lang.Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof defpackage.akzc)) {
                    akzkVar.s((java.lang.String) obj);
                } else {
                    akzkVar.h((defpackage.akzc) obj);
                }
                break;
            case 9:
                ((defpackage.albh) obj).S(akzkVar);
                break;
            case 10:
                akzkVar.o((defpackage.albh) obj);
                break;
            case 11:
                if (!(obj instanceof defpackage.akzc)) {
                    byte[] bArr = (byte[]) obj;
                    akzkVar.y(bArr, bArr.length);
                } else {
                    akzkVar.h((defpackage.akzc) obj);
                }
                break;
            case 12:
                akzkVar.v(((java.lang.Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof defpackage.alah)) {
                    akzkVar.n(((java.lang.Integer) obj).intValue());
                } else {
                    akzkVar.n(((defpackage.alah) obj).a());
                }
                break;
            case 14:
                akzkVar.j(((java.lang.Integer) obj).intValue());
                break;
            case 15:
                akzkVar.l(((java.lang.Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                akzkVar.v((iIntValue << 1) ^ (iIntValue >> 31));
                break;
            case 17:
                long jLongValue = ((java.lang.Long) obj).longValue();
                akzkVar.x((jLongValue << 1) ^ (jLongValue >> 63));
                break;
        }
    }

    public static int i(defpackage.alac alacVar, java.lang.Object obj) {
        return a(alacVar.b, alacVar.a, obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.akzs clone() {
        defpackage.akzs akzsVar = new defpackage.akzs();
        defpackage.alcb alcbVar = this.b;
        int size = alcbVar.size();
        for (int i = 0; i < size; i++) {
            defpackage.alby albyVar = (defpackage.alby) alcbVar.a(i);
            akzsVar.k(albyVar.c, albyVar.a);
        }
        akzsVar.d = this.d;
        return akzsVar;
    }

    public final java.util.Iterator d() {
        if (g()) {
            return java.util.Collections.emptyIterator();
        }
        boolean z = this.d;
        defpackage.alcb alcbVar = this.b;
        return z ? new alaw(alcbVar.entrySet().iterator()) : alcbVar.entrySet().iterator();
    }

    public final void e() {
        if (this.c) {
            return;
        }
        defpackage.alcb alcbVar = this.b;
        int size = alcbVar.size();
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = ((defpackage.alby) alcbVar.a(i)).a;
            if (obj instanceof defpackage.alad) {
                ((defpackage.alad) obj).O();
            }
        }
        if (!alcbVar.c) {
            alcbVar.c();
            if (alcbVar.a != null) {
                for (int i2 = 0; i2 < alcbVar.b; i2++) {
                    defpackage.alac alacVar = ((defpackage.alby) alcbVar.a[i2]).c;
                }
            }
            alcbVar.c = true;
        }
        this.c = true;
    }

    public final boolean equals(java.lang.Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.akzs) {
            defpackage.alcb alcbVar = this.b;
            defpackage.alcb alcbVar2 = ((defpackage.akzs) obj).b;
            if (alcbVar.size() == alcbVar2.size() && alcbVar.keySet().equals(alcbVar2.keySet())) {
                for (java.util.Map.Entry entry : alcbVar.entrySet()) {
                    java.lang.Object key = entry.getKey();
                    java.lang.Object value = entry.getValue();
                    java.lang.Object obj2 = alcbVar2.get(key);
                    if (value == obj2) {
                        zEquals = true;
                    } else if (value == null || obj2 == null) {
                        zEquals = false;
                    } else if (value instanceof defpackage.alax) {
                        zEquals = value.equals(obj2);
                    } else {
                        zEquals = obj2 instanceof defpackage.alax ? obj2.equals(value) : value.equals(obj2);
                    }
                    if (!zEquals) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    final boolean g() {
        return this.b.isEmpty();
    }

    public final boolean h() {
        defpackage.alcb alcbVar = this.b;
        int size = alcbVar.size();
        for (int i = 0; i < size; i++) {
            defpackage.alby albyVar = (defpackage.alby) alcbVar.a(i);
            if (albyVar.c.a() == defpackage.alcs.i) {
                java.lang.Object obj = albyVar.a;
                if (obj instanceof defpackage.albi) {
                    if (!((defpackage.albi) obj).w()) {
                        return false;
                    }
                } else if (!(obj instanceof defpackage.alax)) {
                    throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.Object j(defpackage.alac alacVar) {
        java.lang.Object obj = this.b.get(alacVar);
        return obj instanceof defpackage.alax ? ((defpackage.alax) obj).b() : obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0046  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if ((r6 instanceof defpackage.alah) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if ((r6 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        if (r1 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if ((r6 instanceof defpackage.alax) == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(defpackage.alac r5, java.lang.Object r6) {
        /*
            r4 = this;
            r6.getClass()
            alcr r0 = defpackage.alcr.DOUBLE
            alcs r0 = defpackage.alcs.a
            alcr r0 = r5.b
            alcs r0 = r0.s
            int r1 = r0.ordinal()
            r2 = 1
            switch(r1) {
                case 0: goto L3e;
                case 1: goto L3b;
                case 2: goto L38;
                case 3: goto L35;
                case 4: goto L32;
                case 5: goto L2f;
                case 6: goto L26;
                case 7: goto L1d;
                case 8: goto L14;
                default: goto L13;
            }
        L13:
            goto L4e
        L14:
            boolean r1 = r6 instanceof defpackage.albh
            if (r1 != 0) goto L42
            boolean r1 = r6 instanceof defpackage.alax
            if (r1 == 0) goto L4e
            goto L42
        L1d:
            boolean r1 = r6 instanceof java.lang.Integer
            if (r1 != 0) goto L42
            boolean r1 = r6 instanceof defpackage.alah
            if (r1 == 0) goto L4e
            goto L42
        L26:
            boolean r1 = r6 instanceof defpackage.akzc
            if (r1 != 0) goto L42
            boolean r1 = r6 instanceof byte[]
            if (r1 == 0) goto L4e
            goto L42
        L2f:
            boolean r1 = r6 instanceof java.lang.String
            goto L40
        L32:
            boolean r1 = r6 instanceof java.lang.Boolean
            goto L40
        L35:
            boolean r1 = r6 instanceof java.lang.Double
            goto L40
        L38:
            boolean r1 = r6 instanceof java.lang.Float
            goto L40
        L3b:
            boolean r1 = r6 instanceof java.lang.Long
            goto L40
        L3e:
            boolean r1 = r6 instanceof java.lang.Integer
        L40:
            if (r1 == 0) goto L4e
        L42:
            boolean r0 = r6 instanceof defpackage.alax
            if (r0 == 0) goto L48
            r4.d = r2
        L48:
            alcb r4 = r4.b
            r4.d(r5, r6)
            return
        L4e:
            int r4 = r5.a
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r4
            r1[r2] = r0
            r4 = 2
            r1[r4] = r6
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akzs.k(alac, java.lang.Object):void");
    }

    public final boolean l(defpackage.alac alacVar) {
        return this.b.get(alacVar) != null;
    }

    private akzs() {
    }
}
