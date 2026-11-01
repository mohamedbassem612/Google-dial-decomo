package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aker extends java.util.AbstractMap implements java.io.Serializable {
    defpackage.akeq a;
    int b;
    int c;
    final defpackage.akeq d;
    private final boolean e;
    private defpackage.akem f;
    private defpackage.akeo g;

    public aker(boolean z) {
        this.b = 0;
        this.c = 0;
        this.e = z;
        this.d = new defpackage.akeq(z);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x007f A[SYNTHETIC] */
    private final void f(defpackage.akeq akeqVar, boolean z) {
        while (akeqVar != null) {
            defpackage.akeq akeqVar2 = akeqVar.b;
            defpackage.akeq akeqVar3 = akeqVar.c;
            boolean z2 = false;
            int i = akeqVar2 != null ? akeqVar2.i : 0;
            int i2 = akeqVar3 != null ? akeqVar3.i : 0;
            int i3 = i - i2;
            boolean z3 = true;
            if (i3 == -2) {
                defpackage.akeq akeqVar4 = akeqVar3.b;
                defpackage.akeq akeqVar5 = akeqVar3.c;
                int i4 = (akeqVar4 != null ? akeqVar4.i : 0) - (akeqVar5 != null ? akeqVar5.i : 0);
                if (i4 != -1) {
                    if (i4 == 0) {
                        if (!z) {
                        }
                        if (z3) {
                            return;
                        }
                    } else {
                        z3 = z;
                    }
                    i(akeqVar3);
                    h(akeqVar);
                    if (z3) {
                        return;
                    }
                } else {
                    z2 = z;
                }
                h(akeqVar);
                z3 = z2;
                if (z3) {
                    return;
                }
            } else if (i3 == 2) {
                defpackage.akeq akeqVar6 = akeqVar2.b;
                defpackage.akeq akeqVar7 = akeqVar2.c;
                int i5 = (akeqVar6 != null ? akeqVar6.i : 0) - (akeqVar7 != null ? akeqVar7.i : 0);
                if (i5 != 1) {
                    if (i5 == 0) {
                        if (!z) {
                        }
                        if (z3) {
                            return;
                        }
                    } else {
                        z3 = z;
                    }
                    h(akeqVar2);
                    i(akeqVar);
                    if (z3) {
                        return;
                    }
                } else {
                    z2 = z;
                }
                i(akeqVar);
                z3 = z2;
                if (z3) {
                    return;
                }
            } else if (i3 == 0) {
                akeqVar.i = i + 1;
                if (z) {
                    return;
                }
            } else {
                akeqVar.i = java.lang.Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            akeqVar = akeqVar.a;
        }
    }

    private final void g(defpackage.akeq akeqVar, defpackage.akeq akeqVar2) {
        defpackage.akeq akeqVar3 = akeqVar.a;
        akeqVar.a = null;
        if (akeqVar2 != null) {
            akeqVar2.a = akeqVar3;
        }
        if (akeqVar3 == null) {
            this.a = akeqVar2;
        } else if (akeqVar3.b == akeqVar) {
            akeqVar3.b = akeqVar2;
        } else {
            akeqVar3.c = akeqVar2;
        }
    }

    private final void h(defpackage.akeq akeqVar) {
        defpackage.akeq akeqVar2 = akeqVar.b;
        defpackage.akeq akeqVar3 = akeqVar.c;
        defpackage.akeq akeqVar4 = akeqVar3.b;
        defpackage.akeq akeqVar5 = akeqVar3.c;
        akeqVar.c = akeqVar4;
        if (akeqVar4 != null) {
            akeqVar4.a = akeqVar;
        }
        g(akeqVar, akeqVar3);
        akeqVar3.b = akeqVar;
        akeqVar.a = akeqVar3;
        int iMax = java.lang.Math.max(akeqVar2 != null ? akeqVar2.i : 0, akeqVar4 != null ? akeqVar4.i : 0) + 1;
        akeqVar.i = iMax;
        akeqVar3.i = java.lang.Math.max(iMax, akeqVar5 != null ? akeqVar5.i : 0) + 1;
    }

    private final void i(defpackage.akeq akeqVar) {
        defpackage.akeq akeqVar2 = akeqVar.b;
        defpackage.akeq akeqVar3 = akeqVar.c;
        defpackage.akeq akeqVar4 = akeqVar2.b;
        defpackage.akeq akeqVar5 = akeqVar2.c;
        akeqVar.b = akeqVar5;
        if (akeqVar5 != null) {
            akeqVar5.a = akeqVar;
        }
        g(akeqVar, akeqVar2);
        akeqVar2.c = akeqVar;
        akeqVar.a = akeqVar2;
        int iMax = java.lang.Math.max(akeqVar3 != null ? akeqVar3.i : 0, akeqVar5 != null ? akeqVar5.i : 0) + 1;
        akeqVar.i = iMax;
        akeqVar2.i = java.lang.Math.max(iMax, akeqVar4 != null ? akeqVar4.i : 0) + 1;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization is unsupported");
    }

    private java.lang.Object writeReplace() {
        return new java.util.LinkedHashMap(this);
    }

    final defpackage.akeq a(java.lang.Object obj, boolean z) {
        int iCompareTo;
        defpackage.akeq akeqVar;
        defpackage.akeq akeqVar2 = this.a;
        if (akeqVar2 != null) {
            java.lang.Comparable comparable = (java.lang.Comparable) obj;
            while (true) {
                iCompareTo = comparable.compareTo(akeqVar2.f);
                if (iCompareTo == 0) {
                    return akeqVar2;
                }
                defpackage.akeq akeqVar3 = iCompareTo < 0 ? akeqVar2.b : akeqVar2.c;
                if (akeqVar3 == null) {
                    break;
                }
                akeqVar2 = akeqVar3;
            }
        } else {
            iCompareTo = 0;
        }
        int i = iCompareTo;
        defpackage.akeq akeqVar4 = akeqVar2;
        if (!z) {
            return null;
        }
        defpackage.akeq akeqVar5 = this.d;
        if (akeqVar4 != null) {
            akeqVar = new defpackage.akeq(this.e, akeqVar4, obj, akeqVar5, akeqVar5.e);
            if (i < 0) {
                akeqVar4.b = akeqVar;
            } else {
                akeqVar4.c = akeqVar;
            }
            f(akeqVar4, true);
        } else {
            if (!(obj instanceof java.lang.Comparable)) {
                throw new java.lang.ClassCastException(java.lang.String.valueOf(obj.getClass().getName()).concat(" is not Comparable"));
            }
            defpackage.akeq akeqVar6 = new defpackage.akeq(this.e, null, obj, akeqVar5, akeqVar5.e);
            this.a = akeqVar6;
            akeqVar = akeqVar6;
        }
        this.b++;
        this.c++;
        return akeqVar;
    }

    final defpackage.akeq b(java.util.Map.Entry entry) {
        defpackage.akeq akeqVarC = c(entry.getKey());
        if (akeqVarC == null || !j$.util.Objects.equals(akeqVarC.h, entry.getValue())) {
            return null;
        }
        return akeqVarC;
    }

    final defpackage.akeq c(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return a(obj, false);
        } catch (java.lang.ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a = null;
        this.b = 0;
        this.c++;
        defpackage.akeq akeqVar = this.d;
        akeqVar.e = akeqVar;
        akeqVar.d = akeqVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return c(obj) != null;
    }

    final defpackage.akeq d(java.lang.Object obj) {
        defpackage.akeq akeqVarC = c(obj);
        if (akeqVarC != null) {
            e(akeqVarC, true);
        }
        return akeqVarC;
    }

    final void e(defpackage.akeq akeqVar, boolean z) {
        defpackage.akeq akeqVar2;
        int i;
        defpackage.akeq akeqVar3;
        if (z) {
            defpackage.akeq akeqVar4 = akeqVar.e;
            akeqVar4.d = akeqVar.d;
            akeqVar.d.e = akeqVar4;
        }
        defpackage.akeq akeqVar5 = akeqVar.b;
        defpackage.akeq akeqVar6 = akeqVar.c;
        defpackage.akeq akeqVar7 = akeqVar.a;
        int i2 = 0;
        if (akeqVar5 != null) {
            if (akeqVar6 != null) {
                if (akeqVar5.i > akeqVar6.i) {
                    do {
                        akeqVar2 = akeqVar5;
                        akeqVar5 = akeqVar5.c;
                    } while (akeqVar5 != null);
                } else {
                    do {
                        akeqVar3 = akeqVar6;
                        akeqVar6 = akeqVar6.b;
                    } while (akeqVar6 != null);
                    akeqVar2 = akeqVar3;
                }
                e(akeqVar2, false);
                defpackage.akeq akeqVar8 = akeqVar.b;
                if (akeqVar8 != null) {
                    i = akeqVar8.i;
                    akeqVar2.b = akeqVar8;
                    akeqVar8.a = akeqVar2;
                    akeqVar.b = null;
                } else {
                    i = 0;
                }
                defpackage.akeq akeqVar9 = akeqVar.c;
                if (akeqVar9 != null) {
                    i2 = akeqVar9.i;
                    akeqVar2.c = akeqVar9;
                    akeqVar9.a = akeqVar2;
                    akeqVar.c = null;
                }
                akeqVar2.i = java.lang.Math.max(i, i2) + 1;
                g(akeqVar, akeqVar2);
                return;
            }
            g(akeqVar, akeqVar5);
            akeqVar.b = null;
        } else if (akeqVar6 != null) {
            g(akeqVar, akeqVar6);
            akeqVar.c = null;
        } else {
            g(akeqVar, null);
        }
        f(akeqVar7, false);
        this.b--;
        this.c++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        defpackage.akem akemVar = this.f;
        if (akemVar != null) {
            return akemVar;
        }
        defpackage.akem akemVar2 = new defpackage.akem(this);
        this.f = akemVar2;
        return akemVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        defpackage.akeq akeqVarC = c(obj);
        if (akeqVarC != null) {
            return akeqVarC.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        defpackage.akeo akeoVar = this.g;
        if (akeoVar != null) {
            return akeoVar;
        }
        defpackage.akeo akeoVar2 = new defpackage.akeo(this);
        this.g = akeoVar2;
        return akeoVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        if (obj2 == null && !this.e) {
            throw new java.lang.NullPointerException("value == null");
        }
        defpackage.akeq akeqVarA = a(obj, true);
        java.lang.Object obj3 = akeqVarA.h;
        akeqVarA.h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        defpackage.akeq akeqVarD = d(obj);
        if (akeqVarD != null) {
            return akeqVarD.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.b;
    }

    public aker() {
        this(true);
    }
}
