package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aooc {
    public aooc() {
    }

    public static java.lang.Comparable A(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        defpackage.aooh.f(comparable, "<this>");
        defpackage.aooh.f(comparable2, "maximumValue");
        return comparable.compareTo(comparable2) > 0 ? comparable2 : comparable;
    }

    public static defpackage.aopo B(defpackage.aopo aopoVar, int i) {
        if (aopoVar == null) {
            defpackage.aooh.i("<this>");
        }
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bF((byte) 46, numValueOf, "Step must be positive, was: "));
        }
        int i2 = aopoVar.a;
        int i3 = aopoVar.b;
        if (aopoVar.c <= 0) {
            i = -i;
        }
        return new defpackage.aopo(i2, i3, i);
    }

    public static defpackage.aopq C(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? defpackage.aopq.d : new defpackage.aopq(i, i2 - 1);
    }

    public static java.lang.Comparable D(java.lang.Comparable comparable, aopm aopmVar) {
        if (aopmVar.d()) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bF((byte) 46, aopmVar, "Cannot coerce value to an empty range: "));
        }
        if (!aopm.e(comparable, aopmVar.b()) || aopm.e(aopmVar.b(), comparable)) {
            return (!aopm.e(aopmVar.a(), comparable) || aopm.e(comparable, aopmVar.a())) ? comparable : aopmVar.a();
        }
        return aopmVar.b();
    }

    public static long E(long j) {
        if (j > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:218:0x0262 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x028e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x02d0 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x02de A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
      (r0v0 int) from 0x0007: SWITCH (r0v0 int)
     case -1811142716: goto B:96:0x0104
     case -1811142715: goto B:92:0x00f9
     case -1811142714: goto B:88:0x00ee
     case -1811142713: goto B:84:0x00e3
     case -1811142712: goto B:80:0x00d8
     case -1811142711: goto B:76:0x00cd
     case -1811142710: goto B:72:0x00c2
     case -1811142709: goto B:68:0x00b7
     case -1811142708: goto B:64:0x00ac
     case -1811142707: goto B:60:0x00a1
     default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
      (r0v0 int) from 0x000a: SWITCH (r0v0 int)
     case -1811142685: goto B:56:0x0096
     case -1811142684: goto B:52:0x008b
     case -1811142683: goto B:48:0x0080
     default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
      (r0v0 int) from 0x000d: SWITCH (r0v0 int)
     case 80123371: goto B:44:0x0075
     case 80123372: goto B:40:0x006a
     case 80123373: goto B:36:0x005f
     case 80123374: goto B:32:0x0054
     case 80123375: goto B:28:0x0049
     case 80123376: goto B:24:0x003e
     case 80123377: goto B:20:0x0033
     case 80123378: goto B:16:0x0028
     case 80123379: goto B:12:0x001d
     case 80123380: goto B:8:0x0012
     default: goto B:252:0x02de A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static java.lang.String F(java.lang.String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "kotlin.Double.Companion";
            case "java.lang.Integer":
                return "kotlin.Int";
            case "java.lang.Cloneable":
                return "kotlin.Cloneable";
            case "java.lang.annotation.Annotation":
                return "kotlin.Annotation";
            case "java.lang.Comparable":
                return "kotlin.Comparable";
            case "java.util.Map":
                return "kotlin.collections.Map";
            case "java.util.Set":
                return "kotlin.collections.Set";
            case "double":
                return "kotlin.Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "kotlin.Byte.Companion";
            case "java.lang.CharSequence":
                return "kotlin.CharSequence";
            case "java.util.Collection":
                return "kotlin.collections.Collection";
            case "java.lang.Float":
                return "kotlin.Float";
            case "java.lang.Short":
                return "kotlin.Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "kotlin.Char.Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "kotlin.Long.Companion";
            case "java.util.Map$Entry":
                return "kotlin.collections.Map.Entry";
            case "int":
                return "kotlin.Int";
            case "byte":
                return "kotlin.Byte";
            case "char":
                return "kotlin.Char";
            case "long":
                return "kotlin.Long";
            case "boolean":
                return "kotlin.Boolean";
            case "java.util.List":
                return "kotlin.collections.List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "kotlin.Short.Companion";
            case "float":
                return "kotlin.Float";
            case "short":
                return "kotlin.Short";
            case "java.lang.Character":
                return "kotlin.Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "kotlin.Enum.Companion";
            case "java.lang.Boolean":
                return "kotlin.Boolean";
            case "java.lang.Byte":
                return "kotlin.Byte";
            case "java.lang.Enum":
                return "kotlin.Enum";
            case "java.lang.Long":
                return "kotlin.Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "kotlin.Float.Companion";
            case "java.util.Iterator":
                return "kotlin.collections.Iterator";
            case "java.util.ListIterator":
                return "kotlin.collections.ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "kotlin.String.Companion";
            case "java.lang.Double":
                return "kotlin.Double";
            case "java.lang.Number":
                return "kotlin.Number";
            case "java.lang.Object":
                return "kotlin.Any";
            case "java.lang.String":
                return "kotlin.String";
            case "java.lang.Iterable":
                return "kotlin.collections.Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "kotlin.Boolean.Companion";
            case "java.lang.Throwable":
                return "kotlin.Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "kotlin.Int.Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:210:0x025a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x0284 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x02c6 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x02d1 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x02d4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
      (r0v0 int) from 0x0007: SWITCH (r0v0 int)
     case -1811142716: goto B:96:0x0104
     case -1811142715: goto B:92:0x00f9
     case -1811142714: goto B:88:0x00ee
     case -1811142713: goto B:84:0x00e3
     case -1811142712: goto B:80:0x00d8
     case -1811142711: goto B:76:0x00cd
     case -1811142710: goto B:72:0x00c2
     case -1811142709: goto B:68:0x00b7
     case -1811142708: goto B:64:0x00ac
     case -1811142707: goto B:60:0x00a1
     default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
      (r0v0 int) from 0x000a: SWITCH (r0v0 int)
     case -1811142685: goto B:56:0x0096
     case -1811142684: goto B:52:0x008b
     case -1811142683: goto B:48:0x0080
     default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
      (r0v0 int) from 0x000d: SWITCH (r0v0 int)
     case 80123371: goto B:44:0x0075
     case 80123372: goto B:40:0x006a
     case 80123373: goto B:36:0x005f
     case 80123374: goto B:32:0x0054
     case 80123375: goto B:28:0x0049
     case 80123376: goto B:24:0x003e
     case 80123377: goto B:20:0x0033
     case 80123378: goto B:16:0x0028
     case 80123379: goto B:12:0x001d
     case 80123380: goto B:8:0x0012
     default: goto B:244:0x02d4 A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static java.lang.String G(java.lang.String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "Companion";
            case "java.lang.Integer":
                return "Int";
            case "java.lang.Cloneable":
                return "Cloneable";
            case "java.lang.annotation.Annotation":
                return "Annotation";
            case "java.lang.Comparable":
                return "Comparable";
            case "java.util.Map":
                return "Map";
            case "java.util.Set":
                return "Set";
            case "double":
                return "Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "Companion";
            case "java.lang.CharSequence":
                return "CharSequence";
            case "java.util.Collection":
                return "Collection";
            case "java.lang.Float":
                return "Float";
            case "java.lang.Short":
                return "Short";
            case "kotlin.jvm.internal.CharCompanionObject":
            case "kotlin.jvm.internal.LongCompanionObject":
                return "Companion";
            case "java.util.Map$Entry":
                return "Entry";
            case "int":
                return "Int";
            case "byte":
                return "Byte";
            case "char":
                return "Char";
            case "long":
                return "Long";
            case "boolean":
                return "Boolean";
            case "java.util.List":
                return "List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "Companion";
            case "float":
                return "Float";
            case "short":
                return "Short";
            case "java.lang.Character":
                return "Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "Companion";
            case "java.lang.Boolean":
                return "Boolean";
            case "java.lang.Byte":
                return "Byte";
            case "java.lang.Enum":
                return "Enum";
            case "java.lang.Long":
                return "Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "Companion";
            case "java.util.Iterator":
                return "Iterator";
            case "java.util.ListIterator":
                return "ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "Companion";
            case "java.lang.Double":
                return "Double";
            case "java.lang.Number":
                return "Number";
            case "java.lang.Object":
                return "Any";
            case "java.lang.String":
                return "String";
            case "java.lang.Iterable":
                return "Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "Companion";
            case "java.lang.Throwable":
                return "Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static java.util.Iterator H(java.lang.Object[] objArr) {
        if (objArr == null) {
            defpackage.aooh.i("array");
        }
        return new defpackage.aonw(objArr);
    }

    public static java.lang.Class I(defpackage.aopu aopuVar) {
        if (aopuVar == null) {
            defpackage.aooh.i("<this>");
        }
        java.lang.Class clsA = ((defpackage.aonz) aopuVar).a();
        if (clsA == null) {
            defpackage.aooh.h("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        }
        return clsA;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static java.lang.Class J(defpackage.aopu aopuVar) {
        if (aopuVar == null) {
            defpackage.aooh.i("<this>");
        }
        java.lang.Class clsA = ((defpackage.aonz) aopuVar).a();
        if (clsA.isPrimitive()) {
            java.lang.String name = clsA.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            clsA = java.lang.Double.class;
                        }
                        break;
                    case 104431:
                        if (name.equals("int")) {
                            clsA = java.lang.Integer.class;
                        }
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            clsA = java.lang.Byte.class;
                        }
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            clsA = java.lang.Character.class;
                        }
                        break;
                    case 3327612:
                        if (name.equals("long")) {
                            clsA = java.lang.Long.class;
                        }
                        break;
                    case 3625364:
                        if (name.equals("void")) {
                            clsA = java.lang.Void.class;
                        }
                        break;
                    case 64711720:
                        if (name.equals("boolean")) {
                            clsA = java.lang.Boolean.class;
                        }
                        break;
                    case 97526364:
                        if (name.equals("float")) {
                            clsA = java.lang.Float.class;
                        }
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            clsA = java.lang.Short.class;
                        }
                        break;
                }
            }
            if (clsA == null) {
                defpackage.aooh.h("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            }
        } else if (clsA == null) {
            defpackage.aooh.h("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        }
        return clsA;
    }

    public static defpackage.aopu K(java.lang.annotation.Annotation annotation) {
        defpackage.aooh.f(annotation, "<this>");
        java.lang.Class<? extends java.lang.annotation.Annotation> clsAnnotationType = annotation.annotationType();
        defpackage.aooh.e(clsAnnotationType, "annotationType(...)");
        return L(clsAnnotationType);
    }

    public static defpackage.aopu L(java.lang.Class cls) {
        if (cls == null) {
            defpackage.aooh.i("<this>");
        }
        defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
        return new defpackage.aooa(cls);
    }

    public static void M(java.lang.AutoCloseable autoCloseable, java.lang.Throwable th) throws java.lang.Exception {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (java.lang.Throwable th2) {
                aoil.b(th, th2);
            }
        }
    }

    public static defpackage.aome N(java.util.List list, int i) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return new defpackage.aova(i, list);
    }

    public static boolean O(java.lang.StackTraceElement stackTraceElement) {
        return defpackage.aoov.ad(stackTraceElement.getMethodName(), "runBlocking") && defpackage.aoov.ad(stackTraceElement.getClassName(), "kotlinx.coroutines.BuildersKt");
    }

    public static defpackage.aome P(defpackage.aouw aouwVar) {
        if (!defpackage.aovd.a) {
            return null;
        }
        defpackage.aome aomeVar = (defpackage.aome) j(new defpackage.aoqi(h(aouwVar.r(), new defpackage.aoom() { // from class: aouu
            @Override // defpackage.aoom
            public final java.lang.Object b(java.lang.Object obj) {
                return ((defpackage.aoub) obj).r();
            }
        }), true, defpackage.aouv.a));
        return aomeVar == null ? (defpackage.aome) aouwVar.u().get(apav.a) : aomeVar;
    }

    public static /* synthetic */ int Q(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof java.lang.Throwable) {
            return 0;
        }
        return obj instanceof java.util.ArrayList ? 1 : -2;
    }

    public static /* synthetic */ int R(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof defpackage.aotl) {
            return 0;
        }
        return obj instanceof defpackage.aotx ? 1 : -2;
    }

    public static /* synthetic */ int S(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 4);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof defpackage.aouh) {
            return 0;
        }
        if (obj instanceof defpackage.aotx) {
            return 1;
        }
        return obj instanceof defpackage.aosk ? 2 : -2;
    }

    public static java.lang.Object T(defpackage.aoub aoubVar, defpackage.aoln aolnVar) {
        aoubVar.s(null);
        java.lang.Object objN = aoubVar.n(aolnVar);
        return objN != defpackage.aolu.a ? defpackage.aojh.a : objN;
    }

    public static defpackage.aotj U(defpackage.aoub aoubVar, boolean z, defpackage.aoue aoueVar) {
        return aoubVar instanceof defpackage.aoul ? ((defpackage.aoul) aoubVar).I(z, aoueVar) : aoubVar.q(aoueVar.b(), z, new ahdu(aoueVar, 6, (float[]) null));
    }

    public static defpackage.aoub V(defpackage.aolr aolrVar) {
        defpackage.aoub aoubVar = (defpackage.aoub) aolrVar.get(defpackage.aoub.d);
        if (aoubVar != null) {
            return aoubVar;
        }
        java.util.Objects.toString(aolrVar);
        throw new java.lang.IllegalStateException("Current context doesn't contain Job in it: ".concat(java.lang.String.valueOf(aolrVar)));
    }

    public static void W(defpackage.aolr aolrVar, java.util.concurrent.CancellationException cancellationException) {
        defpackage.aoub aoubVar = (defpackage.aoub) aolrVar.get(defpackage.aoub.d);
        if (aoubVar != null) {
            aoubVar.s(cancellationException);
        }
    }

    public static void X(defpackage.aoub aoubVar, java.lang.String str, java.lang.Throwable th) {
        aoubVar.s(defpackage.aodc.l(str, th));
    }

    public static void Y(defpackage.aolr aolrVar) {
        defpackage.aoub aoubVar = (defpackage.aoub) aolrVar.get(defpackage.aoub.d);
        if (aoubVar != null) {
            Z(aoubVar);
        }
    }

    public static void Z(defpackage.aoub aoubVar) {
        if (!aoubVar.t()) {
            throw aoubVar.o();
        }
    }

    public static boolean aa(defpackage.aolr aolrVar) {
        defpackage.aoub aoubVar = (defpackage.aoub) aolrVar.get(defpackage.aoub.d);
        if (aoubVar != null) {
            return aoubVar.t();
        }
        return true;
    }

    public static java.util.concurrent.Executor ab(defpackage.aosp aospVar) {
        java.util.concurrent.Executor executorH;
        defpackage.aott aottVar = aospVar instanceof defpackage.aott ? (defpackage.aott) aospVar : null;
        return (aottVar == null || (executorH = aottVar.h()) == null) ? new defpackage.aotg(aospVar) : executorH;
    }

    public static defpackage.aosp ac(java.util.concurrent.Executor executor) {
        defpackage.aosp aospVar;
        defpackage.aotg aotgVar = executor instanceof defpackage.aotg ? (defpackage.aotg) executor : null;
        return (aotgVar == null || (aospVar = aotgVar.a) == null) ? new defpackage.aotu(executor) : aospVar;
    }

    public static /* synthetic */ int ad(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 2);
        if (obj == null) {
            return -1;
        }
        return !(obj instanceof defpackage.apcf) ? -2 : 0;
    }

    public static java.lang.Object ae(java.lang.Throwable th) {
        if (th == null) {
            defpackage.aooh.i("exception");
        }
        return new defpackage.aoiv(th);
    }

    public static void af(java.lang.Object obj) {
        if (obj instanceof defpackage.aoiv) {
            throw ((defpackage.aoiv) obj).a;
        }
    }

    public static defpackage.aoir ag(defpackage.aomy aomyVar) {
        if (aomyVar == null) {
            defpackage.aooh.i("initializer");
        }
        return new defpackage.aoiy(aomyVar);
    }

    public static defpackage.aoir ah(int i, defpackage.aomy aomyVar) {
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? new defpackage.aoji(aomyVar) : new defpackage.aoix(aomyVar);
        }
        return new defpackage.aoiy(aomyVar);
    }

    public static java.net.PasswordAuthentication ai(java.lang.String str, java.net.InetAddress inetAddress, int i) {
        java.net.URL url;
        try {
            url = new java.net.URL("https", str, i, "");
        } catch (java.net.MalformedURLException unused) {
            defpackage.aoav.a.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", "failed to create URL for Authenticator: {0} {1}", new java.lang.Object[]{"https", str});
            url = null;
        }
        return java.net.Authenticator.requestPasswordAuthentication(str, inetAddress, i, "https", "", null, url, java.net.Authenticator.RequestorType.PROXY);
    }

    public static defpackage.anym aj() {
        return defpackage.aobc.a == null ? new defpackage.aobc() : new anux();
    }

    public static /* synthetic */ defpackage.albh ak() {
        try {
            return defpackage.alfa.a;
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    public static /* synthetic */ defpackage.albh al() {
        try {
            return (defpackage.alfc) defpackage.alad.y(defpackage.alfc.a, android.util.Base64.decode("CgUyMDgwMQoFMjA4MDI", 3));
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    public static defpackage.amzg am(java.lang.Object obj) {
        return new defpackage.amzh(obj == null ? defpackage.ajcm.a : new defpackage.ajcm(obj));
    }

    public static void an(java.lang.Object obj, java.lang.Class cls) {
        if (obj == null) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static void ao(java.lang.Object obj) {
        obj.getClass();
    }

    public static void ap(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static boolean aq(android.content.Context context) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        java.util.Set setHn = ((defpackage.amxa) ar(defpackage.anty.aA(context.getApplicationContext()), defpackage.amxa.class)).hn();
        defpackage.aikn aiknVar = (defpackage.aikn) setHn;
        defpackage.ajsz.dA(aiknVar.e <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new java.lang.Object[0]);
        if (setHn.isEmpty()) {
            return true;
        }
        return ((java.lang.Boolean) aiknVar.iterator().next()).booleanValue();
    }

    public static java.lang.Object ar(java.lang.Object obj, java.lang.Class cls) {
        boolean z;
        if (!(obj instanceof defpackage.amyo)) {
            if (obj instanceof defpackage.amyp) {
                return ar(((defpackage.amyp) obj).B(), cls);
            }
            throw new java.lang.IllegalStateException(java.lang.String.format("Given component holder %s does not implement %s or %s", obj.getClass(), defpackage.amyo.class, defpackage.amyp.class));
        }
        if (obj instanceof defpackage.amyr) {
            java.lang.annotation.Annotation[] annotations = cls.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                if (annotations[i].annotationType().getCanonicalName().contentEquals("dagger.hilt.android.EarlyEntryPoint")) {
                    z = true;
                    break;
                }
                i++;
            }
            defpackage.ajsz.dA(!z, "Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", cls.getCanonicalName());
        }
        return cls.cast(obj);
    }

    public static ammt as(java.lang.String str, ammp ammpVar, amms ammsVar) {
        try {
            return new ammq((java.net.HttpURLConnection) new java.net.URL(str).openConnection(), ammpVar, ammsVar);
        } catch (java.net.MalformedURLException e) {
            throw new java.lang.IllegalArgumentException("Url is malformed.", e);
        } catch (java.io.IOException e2) {
            throw new java.lang.IllegalStateException("Http connection could not be created.", e2);
        }
    }

    public static defpackage.akzm at(j$.time.Duration duration) {
        if (duration == null) {
            defpackage.aooh.i("<this>");
        }
        defpackage.akzm akzmVarF = defpackage.aldf.f(duration.getSeconds(), duration.getNano());
        defpackage.aooh.e(akzmVarF, "toProtoDuration(...)");
        return akzmVarF;
    }

    public static defpackage.alcf au(j$.time.Instant instant) {
        defpackage.aooh.f(instant, "<this>");
        defpackage.alcf alcfVarDI = defpackage.ajsz.dI(instant);
        defpackage.aooh.e(alcfVarDI, "toProtoTimestamp(...)");
        return alcfVarDI;
    }

    public static j$.time.Duration av(defpackage.akzm akzmVar) {
        defpackage.aooh.f(akzmVar, "<this>");
        j$.time.Duration durationDJ = defpackage.ajsz.dJ(akzmVar);
        defpackage.aooh.e(durationDJ, "toJavaDuration(...)");
        return durationDJ;
    }

    public static j$.time.Instant aw(defpackage.alcf alcfVar) {
        defpackage.aooh.f(alcfVar, "<this>");
        j$.time.Instant instantDK = defpackage.ajsz.dK(alcfVar);
        defpackage.aooh.e(instantDK, "toJavaInstant(...)");
        return instantDK;
    }

    public static java.util.Iterator e(defpackage.aonn aonnVar) {
        defpackage.aoqm aoqmVar = new defpackage.aoqm();
        aoqmVar.a = defpackage.ajsz.ao(aonnVar, aoqmVar, aoqmVar);
        return aoqmVar;
    }

    public static defpackage.aoql f(java.util.Iterator it) {
        return g(new aoka(it, 4));
    }

    public static defpackage.aoql g(defpackage.aoql aoqlVar) {
        return !(aoqlVar instanceof defpackage.aoqd) ? new defpackage.aoqd(aoqlVar) : aoqlVar;
    }

    public static defpackage.aoql h(java.lang.Object obj, defpackage.aonj aonjVar) {
        return obj == null ? aoqg.a : new defpackage.aoqk(new defpackage.acik(obj, 13), aonjVar);
    }

    public static int i(defpackage.aoql aoqlVar) {
        java.util.Iterator itA = aoqlVar.a();
        int i = 0;
        while (itA.hasNext()) {
            itA.next();
            i++;
            if (i < 0) {
                defpackage.ajsz.bg();
            }
        }
        return i;
    }

    public static java.lang.Object j(defpackage.aoql aoqlVar) {
        defpackage.aoqh aoqhVar = new defpackage.aoqh((defpackage.aoqi) aoqlVar);
        if (aoqhVar.hasNext()) {
            return aoqhVar.next();
        }
        return null;
    }

    public static java.util.List k(defpackage.aoql aoqlVar) {
        java.util.Iterator itA = aoqlVar.a();
        if (!itA.hasNext()) {
            return defpackage.aokc.a;
        }
        java.lang.Object next = itA.next();
        if (!itA.hasNext()) {
            return defpackage.ajsz.aY(next);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(next);
        while (itA.hasNext()) {
            arrayList.add(itA.next());
        }
        return arrayList;
    }

    public static defpackage.aoql l(defpackage.aoql aoqlVar, defpackage.aonj aonjVar) {
        if (aonjVar == null) {
            defpackage.aooh.i("predicate");
        }
        return new defpackage.aoqi(aoqlVar, true, aonjVar);
    }

    public static defpackage.aoql m(defpackage.aoql aoqlVar) {
        return new defpackage.aoqi(aoqlVar, false, new agkh(16));
    }

    public static defpackage.aoql n(defpackage.aoql aoqlVar, defpackage.aonj aonjVar) {
        return m(new aoqt(aoqlVar, aonjVar, 2));
    }

    public static java.lang.String o(defpackage.aoql aoqlVar, java.lang.CharSequence charSequence) throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "");
        java.util.Iterator itA = aoqlVar.a();
        int i = 0;
        while (itA.hasNext()) {
            java.lang.Object next = itA.next();
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            defpackage.aoov.k(sb, next, null);
        }
        sb.append((java.lang.CharSequence) "");
        return sb.toString();
    }

    public static double p(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            return d > d3 ? d3 : d;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static float q(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static float r(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static float s(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int t(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static int u(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static int v(int i, defpackage.aopn aopnVar) {
        defpackage.aooh.f(aopnVar, "range");
        if (aopnVar.d()) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bF((byte) 46, aopnVar, "Cannot coerce value to an empty range: "));
        }
        defpackage.aopq aopqVar = (defpackage.aopq) aopnVar;
        if (i < aopqVar.c().intValue()) {
            return aopqVar.c().intValue();
        }
        return i > aopqVar.b().intValue() ? aopqVar.b().intValue() : i;
    }

    public static int w(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bv((byte) 46, i2, i3, "Cannot coerce value to an empty range: maximum ", " is less than minimum "));
        }
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static long x(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static long y(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static java.lang.Comparable z(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        if (comparable == null) {
            defpackage.aooh.i("<this>");
        }
        if (comparable2 == null) {
            defpackage.aooh.i("minimumValue");
        }
        return comparable.compareTo(comparable2) < 0 ? comparable2 : comparable;
    }

    public aooc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
    }

    public void b(long j) {
    }

    public void c(long j) {
    }
}
