package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class efy implements defpackage.efa {
    public static final defpackage.efy a = new defpackage.efy();

    @Override // defpackage.efa
    public final /* synthetic */ java.lang.Object a() {
        return new defpackage.efx(true);
    }

    @Override // defpackage.efa
    public final java.lang.Object b(java.io.InputStream inputStream) throws defpackage.ecp {
        int i;
        try {
            defpackage.efr efrVar = defpackage.efr.DEFAULT_INSTANCE;
            int i2 = defpackage.egq.e;
            defpackage.egp egpVar = new defpackage.egp(inputStream);
            defpackage.egz egzVarA = defpackage.egz.a();
            defpackage.ehg ehgVarL = efrVar.l();
            try {
                try {
                    defpackage.eig eigVarA = defpackage.eid.a.a(ehgVarL);
                    java.lang.Object egrVar = egpVar.d;
                    if (egrVar == null) {
                        egrVar = new defpackage.egr(egpVar);
                    }
                    eigVarA.f(ehgVarL, (defpackage.egr) egrVar, egzVarA);
                    eigVarA.d(ehgVarL);
                    if (ehgVarL != null && !defpackage.ehg.t(ehgVarL)) {
                        throw new defpackage.eim().a();
                    }
                    defpackage.efr efrVar2 = (defpackage.efr) ehgVarL;
                    defpackage.aooh.c(efrVar2);
                    defpackage.efx efxVarT = defpackage.dzk.t(new defpackage.dzk[0]);
                    java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(efrVar2.preferences_);
                    defpackage.aooh.e(mapUnmodifiableMap, "getPreferencesMap(...)");
                    for (java.util.Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                        java.lang.String str = (java.lang.String) entry.getKey();
                        defpackage.eft eftVar = (defpackage.eft) entry.getValue();
                        defpackage.aooh.c(str);
                        defpackage.aooh.c(eftVar);
                        switch (eftVar.valueCase_) {
                            case 0:
                                i = 9;
                                break;
                            case 1:
                                i = 1;
                                break;
                            case 2:
                                i = 2;
                                break;
                            case 3:
                                i = 3;
                                break;
                            case 4:
                                i = 4;
                                break;
                            case 5:
                                i = 5;
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                i = 6;
                                break;
                            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                                i = 7;
                                break;
                            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                                i = 8;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                        if (i == 0) {
                            throw new defpackage.ecp("Value case is null.", null);
                        }
                        switch (i - 1) {
                            case 0:
                                efxVarT.e(defpackage.dzk.s(str), java.lang.Boolean.valueOf(eftVar.valueCase_ == 1 ? ((java.lang.Boolean) eftVar.value_).booleanValue() : false));
                                break;
                            case 1:
                                efxVarT.e(defpackage.dzk.s(str), java.lang.Float.valueOf(eftVar.valueCase_ == 2 ? ((java.lang.Float) eftVar.value_).floatValue() : 0.0f));
                                break;
                            case 2:
                                efxVarT.e(defpackage.dzk.s(str), java.lang.Integer.valueOf(eftVar.valueCase_ == 3 ? ((java.lang.Integer) eftVar.value_).intValue() : 0));
                                break;
                            case 3:
                                efxVarT.e(defpackage.dzk.s(str), java.lang.Long.valueOf(eftVar.valueCase_ == 4 ? ((java.lang.Long) eftVar.value_).longValue() : 0L));
                                break;
                            case 4:
                                efxVarT.e(defpackage.dzk.s(str), eftVar.valueCase_ == 5 ? (java.lang.String) eftVar.value_ : "");
                                break;
                            case 5:
                                defpackage.efw efwVarS = defpackage.dzk.s(str);
                                defpackage.ehk ehkVar = (eftVar.valueCase_ == 6 ? (defpackage.efs) eftVar.value_ : defpackage.efs.DEFAULT_INSTANCE).strings_;
                                defpackage.aooh.e(ehkVar, "getStringsList(...)");
                                efxVarT.e(efwVarS, defpackage.ajsz.cf(ehkVar));
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                efxVarT.e(defpackage.dzk.s(str), java.lang.Double.valueOf(eftVar.valueCase_ == 7 ? ((java.lang.Double) eftVar.value_).doubleValue() : 0.0d));
                                break;
                            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                                efxVarT.e(defpackage.dzk.s(str), (eftVar.valueCase_ == 8 ? (defpackage.egm) eftVar.value_ : defpackage.egm.d).j());
                                break;
                            default:
                                throw new defpackage.ecp("Value not set.", null);
                        }
                    }
                    return new defpackage.efx(defpackage.ajsz.aT(efxVarT.b()), true);
                } catch (java.io.IOException e) {
                    if (e.getCause() instanceof defpackage.eho) {
                        throw ((defpackage.eho) e.getCause());
                    }
                    throw new defpackage.eho(e);
                } catch (java.lang.RuntimeException e2) {
                    if (e2.getCause() instanceof defpackage.eho) {
                        throw ((defpackage.eho) e2.getCause());
                    }
                    throw e2;
                }
            } catch (defpackage.eho e3) {
                if (e3.a) {
                    throw new defpackage.eho(e3);
                }
                throw e3;
            } catch (defpackage.eim e4) {
                throw e4.a();
            }
        } catch (defpackage.eho e5) {
            throw new defpackage.ecp("Unable to parse preferences proto. Consider providing a CorruptionHandler to the DataStore factory to handle such scenarios.", e5);
        }
    }

    @Override // defpackage.efa
    public final /* synthetic */ java.lang.Object c(java.lang.Object obj, java.io.OutputStream outputStream) throws java.io.IOException {
        defpackage.eft eftVar;
        java.util.Map mapB = ((defpackage.efx) obj).b();
        defpackage.ehe eheVarI = defpackage.efr.DEFAULT_INSTANCE.i();
        for (java.util.Map.Entry entry : mapB.entrySet()) {
            defpackage.efw efwVar = (defpackage.efw) entry.getKey();
            java.lang.Object value = entry.getValue();
            java.lang.String str = efwVar.a;
            if (value instanceof java.lang.Boolean) {
                defpackage.ehe eheVarB = defpackage.eft.b();
                java.lang.Boolean bool = (java.lang.Boolean) value;
                bool.booleanValue();
                eheVarB.g();
                defpackage.eft eftVar2 = (defpackage.eft) eheVarB.b;
                eftVar2.valueCase_ = 1;
                eftVar2.value_ = bool;
                defpackage.ehg ehgVarD = eheVarB.d();
                defpackage.aooh.e(ehgVarD, "build(...)");
                eftVar = (defpackage.eft) ehgVarD;
            } else if (value instanceof java.lang.Float) {
                defpackage.ehe eheVarB2 = defpackage.eft.b();
                float fFloatValue = ((java.lang.Number) value).floatValue();
                eheVarB2.g();
                defpackage.eft eftVar3 = (defpackage.eft) eheVarB2.b;
                eftVar3.valueCase_ = 2;
                eftVar3.value_ = java.lang.Float.valueOf(fFloatValue);
                defpackage.ehg ehgVarD2 = eheVarB2.d();
                defpackage.aooh.e(ehgVarD2, "build(...)");
                eftVar = (defpackage.eft) ehgVarD2;
            } else if (value instanceof java.lang.Double) {
                defpackage.ehe eheVarB3 = defpackage.eft.b();
                double dDoubleValue = ((java.lang.Number) value).doubleValue();
                eheVarB3.g();
                defpackage.eft eftVar4 = (defpackage.eft) eheVarB3.b;
                eftVar4.valueCase_ = 7;
                eftVar4.value_ = java.lang.Double.valueOf(dDoubleValue);
                defpackage.ehg ehgVarD3 = eheVarB3.d();
                defpackage.aooh.e(ehgVarD3, "build(...)");
                eftVar = (defpackage.eft) ehgVarD3;
            } else if (value instanceof java.lang.Integer) {
                defpackage.ehe eheVarB4 = defpackage.eft.b();
                int iIntValue = ((java.lang.Number) value).intValue();
                eheVarB4.g();
                defpackage.eft eftVar5 = (defpackage.eft) eheVarB4.b;
                eftVar5.valueCase_ = 3;
                eftVar5.value_ = java.lang.Integer.valueOf(iIntValue);
                defpackage.ehg ehgVarD4 = eheVarB4.d();
                defpackage.aooh.e(ehgVarD4, "build(...)");
                eftVar = (defpackage.eft) ehgVarD4;
            } else if (value instanceof java.lang.Long) {
                defpackage.ehe eheVarB5 = defpackage.eft.b();
                long jLongValue = ((java.lang.Number) value).longValue();
                eheVarB5.g();
                defpackage.eft eftVar6 = (defpackage.eft) eheVarB5.b;
                eftVar6.valueCase_ = 4;
                eftVar6.value_ = java.lang.Long.valueOf(jLongValue);
                defpackage.ehg ehgVarD5 = eheVarB5.d();
                defpackage.aooh.e(ehgVarD5, "build(...)");
                eftVar = (defpackage.eft) ehgVarD5;
            } else if (value instanceof java.lang.String) {
                defpackage.ehe eheVarB6 = defpackage.eft.b();
                java.lang.String str2 = (java.lang.String) value;
                eheVarB6.g();
                defpackage.eft eftVar7 = (defpackage.eft) eheVarB6.b;
                j$.util.Objects.requireNonNull(str2);
                eftVar7.valueCase_ = 5;
                eftVar7.value_ = str2;
                defpackage.ehg ehgVarD6 = eheVarB6.d();
                defpackage.aooh.e(ehgVarD6, "build(...)");
                eftVar = (defpackage.eft) ehgVarD6;
            } else if (value instanceof java.util.Set) {
                defpackage.ehe eheVarB7 = defpackage.eft.b();
                defpackage.ehe eheVarI2 = defpackage.efs.DEFAULT_INSTANCE.i();
                defpackage.aooh.d(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                java.util.Set set = (java.util.Set) value;
                eheVarI2.g();
                defpackage.efs efsVar = (defpackage.efs) eheVarI2.b;
                defpackage.ehk ehkVar = efsVar.strings_;
                if (!ehkVar.c()) {
                    efsVar.strings_ = ehkVar.d(ehkVar.size() << 1);
                }
                java.util.List list = efsVar.strings_;
                defpackage.ehl.a(set);
                if (set instanceof defpackage.ehr) {
                    java.util.List listA = ((defpackage.ehr) set).a();
                    defpackage.ehr ehrVar = (defpackage.ehr) list;
                    int size = list.size();
                    for (java.lang.Object obj2 : listA) {
                        if (obj2 == null) {
                            java.lang.String str3 = "Element at index " + (ehrVar.size() - size) + " is null.";
                            int size2 = ehrVar.size();
                            while (true) {
                                size2--;
                                if (size2 < size) {
                                    throw new java.lang.NullPointerException(str3);
                                }
                                ehrVar.remove(size2);
                            }
                        } else if (obj2 instanceof defpackage.egm) {
                            ehrVar.b();
                        } else if (obj2 instanceof byte[]) {
                            defpackage.egm.h((byte[]) obj2);
                            ehrVar.b();
                        } else {
                            ehrVar.add((java.lang.String) obj2);
                        }
                    }
                } else if (set instanceof defpackage.eic) {
                    list.addAll(set);
                } else {
                    if (set instanceof java.util.Collection) {
                        int size3 = set.size();
                        if (list instanceof java.util.ArrayList) {
                            ((java.util.ArrayList) list).ensureCapacity(list.size() + size3);
                        } else if (list instanceof defpackage.eie) {
                            defpackage.eie eieVar = (defpackage.eie) list;
                            int size4 = list.size() + size3;
                            int length = eieVar.b.length;
                            if (size4 > length) {
                                if (length == 0) {
                                    eieVar.b = new java.lang.Object[java.lang.Math.max(size4, 10)];
                                } else {
                                    while (length < size4) {
                                        length = java.lang.Math.max(((length * 3) / 2) + 1, 10);
                                    }
                                    eieVar.b = java.util.Arrays.copyOf(eieVar.b, length);
                                }
                            }
                        }
                    }
                    int size5 = list.size();
                    if ((set instanceof java.util.List) && (set instanceof java.util.RandomAccess)) {
                        java.util.List list2 = (java.util.List) set;
                        int size6 = list2.size();
                        for (int i = 0; i < size6; i++) {
                            java.lang.Object obj3 = list2.get(i);
                            if (obj3 == null) {
                                defpackage.ega.b(list, size5);
                            }
                            list.add(obj3);
                        }
                    } else {
                        for (java.lang.Object obj4 : set) {
                            if (obj4 == null) {
                                defpackage.ega.b(list, size5);
                            }
                            list.add(obj4);
                        }
                    }
                }
                eheVarB7.g();
                defpackage.eft eftVar8 = (defpackage.eft) eheVarB7.b;
                defpackage.efs efsVar2 = (defpackage.efs) eheVarI2.d();
                j$.util.Objects.requireNonNull(efsVar2);
                eftVar8.value_ = efsVar2;
                eftVar8.valueCase_ = 6;
                defpackage.ehg ehgVarD7 = eheVarB7.d();
                defpackage.aooh.e(ehgVarD7, "build(...)");
                eftVar = (defpackage.eft) ehgVarD7;
            } else {
                if (!(value instanceof byte[])) {
                    throw new java.lang.IllegalStateException("PreferencesSerializer does not support type: ".concat(java.lang.String.valueOf(value.getClass().getName())));
                }
                defpackage.ehe eheVarB8 = defpackage.eft.b();
                defpackage.egm egmVarH = defpackage.egm.h((byte[]) value);
                eheVarB8.g();
                defpackage.eft eftVar9 = (defpackage.eft) eheVarB8.b;
                j$.util.Objects.requireNonNull(egmVarH);
                eftVar9.valueCase_ = 8;
                eftVar9.value_ = egmVarH;
                defpackage.ehg ehgVarD8 = eheVarB8.d();
                defpackage.aooh.e(ehgVarD8, "build(...)");
                eftVar = (defpackage.eft) ehgVarD8;
            }
            j$.util.Objects.requireNonNull(str);
            j$.util.Objects.requireNonNull(eftVar);
            eheVarI.g();
            defpackage.efr efrVar = (defpackage.efr) eheVarI.b;
            defpackage.eht ehtVar = efrVar.preferences_;
            if (!ehtVar.b) {
                efrVar.preferences_ = ehtVar.a();
            }
            efrVar.preferences_.put(str, eftVar);
        }
        defpackage.efr efrVar2 = (defpackage.efr) eheVarI.d();
        int iC = efrVar2.c(null);
        if (iC > 4096) {
            iC = 4096;
        }
        defpackage.egu eguVar = new defpackage.egu(outputStream, iC);
        efrVar2.r(eguVar);
        if (eguVar.a > 0) {
            eguVar.C();
        }
        return defpackage.aojh.a;
    }
}
