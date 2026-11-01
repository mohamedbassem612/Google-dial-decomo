package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class ehy {
    public static final /* synthetic */ int a = 0;
    private static final char[] b;

    static {
        char[] cArr = new char[80];
        b = cArr;
        java.util.Arrays.fill(cArr, ' ');
    }

    static void a(java.lang.StringBuilder sb, int i, java.lang.String str, java.lang.Object obj) {
        java.lang.String strReplace;
        if (obj instanceof java.util.List) {
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            java.util.Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (java.util.Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i, sb);
        sb.append(anty.J(str));
        if (!(obj instanceof java.lang.String)) {
            if (obj instanceof egm) {
                sb.append(": \"");
                sb.append(ece.d((egm) obj));
                sb.append('\"');
                return;
            }
            if (obj instanceof ehg) {
                sb.append(" {");
                b((ehg) obj, sb, i + 2);
                sb.append('\n');
                c(i, sb);
                sb.append('}');
                return;
            }
            if (!(obj instanceof java.util.Map.Entry)) {
                sb.append(": ");
                sb.append(obj);
                return;
            }
            int i2 = i + 2;
            sb.append(" {");
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            a(sb, i2, "key", entry.getKey());
            a(sb, i2, "value", entry.getValue());
            sb.append('\n');
            c(i, sb);
            sb.append('}');
            return;
        }
        sb.append(": \"");
        java.lang.String strReplace2 = (java.lang.String) obj;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < strReplace2.length(); i3++) {
            char cCharAt = strReplace2.charAt(i3);
            if (cCharAt < ' ' || cCharAt > '~') {
                strReplace = anty.G(strReplace2.getBytes(java.nio.charset.StandardCharsets.UTF_8));
                sb.append(strReplace);
                sb.append('\"');
            } else {
                if (cCharAt == '\"') {
                    z3 = true;
                } else if (cCharAt == '\'') {
                    z2 = true;
                } else if (cCharAt == '\\') {
                    z = true;
                }
            }
        }
        if (z) {
            strReplace2 = strReplace2.replace("\\", "\\\\");
        }
        strReplace = z2 ? strReplace2.replace("'", "\\'") : strReplace2;
        if (z3) {
            strReplace = strReplace.replace("\"", "\\\"");
        }
        sb.append(strReplace);
        sb.append('\"');
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fc  */
    public static void b(ehw ehwVar, java.lang.StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zBooleanValue;
        boolean zEquals;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap map = new java.util.HashMap();
        java.util.TreeMap treeMap = new java.util.TreeMap();
        java.lang.reflect.Method[] declaredMethods = ehwVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            java.lang.reflect.Method method3 = declaredMethods[i4];
            if (!java.lang.reflect.Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (java.lang.reflect.Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            java.lang.String strSubstring = ((java.lang.String) entry.getKey()).substring(i2);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (java.lang.reflect.Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(java.util.List.class)) {
                    java.lang.String strSubstring2 = strSubstring.substring(0, strSubstring.length() - 4);
                    java.util.Map map2 = ehg.defaultInstanceMap;
                    a(sb, i, strSubstring2, anty.O(method2, ehwVar, new java.lang.Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (java.lang.reflect.Method) entry.getValue()) != null && method.getReturnType().equals(java.util.Map.class) && !method.isAnnotationPresent(java.lang.Deprecated.class) && java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
                java.lang.String strSubstring3 = strSubstring.substring(0, strSubstring.length() - 3);
                java.util.Map map3 = ehg.defaultInstanceMap;
                a(sb, i, strSubstring3, anty.O(method, ehwVar, new java.lang.Object[0]));
            } else if (hashSet.contains("set".concat(java.lang.String.valueOf(strSubstring))) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(java.lang.String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                java.lang.reflect.Method method4 = (java.lang.reflect.Method) entry.getValue();
                java.lang.reflect.Method method5 = (java.lang.reflect.Method) map.get("has".concat(java.lang.String.valueOf(strSubstring)));
                if (method4 != null) {
                    java.util.Map map4 = ehg.defaultInstanceMap;
                    java.lang.Object objO = anty.O(method4, ehwVar, new java.lang.Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((java.lang.Boolean) anty.O(method5, ehwVar, new java.lang.Object[0])).booleanValue();
                    } else if (objO instanceof java.lang.Boolean) {
                        if (((java.lang.Boolean) objO).booleanValue()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                    } else if (objO instanceof java.lang.Integer) {
                        if (((java.lang.Integer) objO).intValue() == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (objO instanceof java.lang.Float) {
                        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) objO).floatValue()) == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (!(objO instanceof java.lang.Double)) {
                        if (objO instanceof java.lang.String) {
                            zEquals = objO.equals("");
                        } else if (objO instanceof egm) {
                            zEquals = objO.equals(egm.d);
                        } else if (!(objO instanceof ehw) ? !((objO instanceof java.lang.Enum) && ((java.lang.Enum) objO).ordinal() == 0) : objO != ((ehw) objO).f()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) objO).doubleValue()) == 0) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = true;
                    }
                    if (zBooleanValue) {
                        a(sb, i, strSubstring, objO);
                    }
                }
            }
            i2 = i3;
        }
        if (ehwVar instanceof ehf) {
            java.util.Iterator itB = ((ehf) ehwVar).extensions.b();
            if (itB.hasNext()) {
                throw null;
            }
        }
        eio eioVar = ((ehg) ehwVar).unknownFields;
        if (eioVar != null) {
            for (int i5 = 0; i5 < eioVar.b; i5++) {
                a(sb, i, java.lang.String.valueOf(eioVar.c[i5] >>> 3), eioVar.d[i5]);
            }
        }
    }

    private static void c(int i, java.lang.StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(b, 0, i2);
            i -= i2;
        }
    }
}
