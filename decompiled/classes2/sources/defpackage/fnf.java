package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fnf extends defpackage.fnh {
    public long a;
    public long[] b;
    public long[] c;

    public fnf() {
        super(new defpackage.flg());
        this.a = -9223372036854775807L;
        this.b = new long[0];
        this.c = new long[0];
    }

    private static java.lang.Double d(defpackage.etx etxVar) {
        return java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(etxVar.v()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Date] */
    private static java.lang.Object e(defpackage.etx etxVar, int i) {
        ?? map;
        if (i == 0) {
            return d(etxVar);
        }
        if (i == 1) {
            return java.lang.Boolean.valueOf(etxVar.n() == 1);
        }
        if (i == 2) {
            return f(etxVar);
        }
        if (i == 3) {
            map = new java.util.HashMap();
            while (true) {
                java.lang.String strF = f(etxVar);
                int iN = etxVar.n();
                if (iN == 9) {
                    break;
                }
                java.lang.Object objE = e(etxVar, iN);
                if (objE != null) {
                    map.put(strF, objE);
                }
            }
        } else {
            if (i == 8) {
                return g(etxVar);
            }
            if (i == 10) {
                int iQ = etxVar.q();
                java.util.ArrayList arrayList = new java.util.ArrayList(iQ);
                for (int i2 = 0; i2 < iQ; i2++) {
                    java.lang.Object objE2 = e(etxVar, etxVar.n());
                    if (objE2 != null) {
                        arrayList.add(objE2);
                    }
                }
                return arrayList;
            }
            if (i != 11) {
                return null;
            }
            map = new java.util.Date((long) d(etxVar).doubleValue());
            etxVar.R(2);
        }
        return map;
    }

    private static java.lang.String f(defpackage.etx etxVar) {
        int iS = etxVar.s();
        int i = etxVar.c;
        etxVar.R(iS);
        return new java.lang.String(etxVar.b, i, iS);
    }

    private static java.util.HashMap g(defpackage.etx etxVar) {
        int iQ = etxVar.q();
        java.util.HashMap map = new java.util.HashMap(iQ);
        for (int i = 0; i < iQ; i++) {
            java.lang.String strF = f(etxVar);
            java.lang.Object objE = e(etxVar, etxVar.n());
            if (objE != null) {
                map.put(strF, objE);
            }
        }
        return map;
    }

    @Override // defpackage.fnh
    protected final boolean a(defpackage.etx etxVar) {
        return true;
    }

    @Override // defpackage.fnh
    protected final boolean b(defpackage.etx etxVar, long j) {
        if (etxVar.n() == 2 && "onMetaData".equals(f(etxVar)) && etxVar.d() != 0 && etxVar.n() == 8) {
            java.util.HashMap mapG = g(etxVar);
            java.lang.Object obj = mapG.get("duration");
            if (obj instanceof java.lang.Double) {
                double dDoubleValue = ((java.lang.Double) obj).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.a = (long) (dDoubleValue * 1000000.0d);
                }
            }
            java.lang.Object obj2 = mapG.get("keyframes");
            if (obj2 instanceof java.util.Map) {
                java.util.Map map = (java.util.Map) obj2;
                java.lang.Object obj3 = map.get("filepositions");
                java.lang.Object obj4 = map.get("times");
                if ((obj3 instanceof java.util.List) && (obj4 instanceof java.util.List)) {
                    java.util.List list = (java.util.List) obj3;
                    java.util.List list2 = (java.util.List) obj4;
                    int size = list2.size();
                    this.b = new long[size];
                    this.c = new long[size];
                    for (int i = 0; i < size; i++) {
                        java.lang.Object obj5 = list.get(i);
                        java.lang.Object obj6 = list2.get(i);
                        if (!(obj6 instanceof java.lang.Double) || !(obj5 instanceof java.lang.Double)) {
                            this.b = new long[0];
                            this.c = new long[0];
                            break;
                        }
                        this.b[i] = (long) (((java.lang.Double) obj6).doubleValue() * 1000000.0d);
                        this.c[i] = ((java.lang.Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }
}
