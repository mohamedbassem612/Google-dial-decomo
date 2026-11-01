package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class f {
    private static final int[] b = {0, 4, 8};
    private static final android.util.SparseIntArray c;
    public final java.util.HashMap a = new java.util.HashMap();

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        c = sparseIntArray;
        int[] iArr = defpackage.h.a;
        sparseIntArray.append(85, 25);
        sparseIntArray.append(86, 26);
        sparseIntArray.append(88, 29);
        sparseIntArray.append(89, 30);
        sparseIntArray.append(95, 36);
        sparseIntArray.append(94, 35);
        sparseIntArray.append(67, 4);
        sparseIntArray.append(66, 3);
        sparseIntArray.append(62, 1);
        sparseIntArray.append(103, 6);
        sparseIntArray.append(104, 7);
        sparseIntArray.append(74, 17);
        sparseIntArray.append(75, 18);
        sparseIntArray.append(76, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(90, 32);
        sparseIntArray.append(91, 33);
        sparseIntArray.append(73, 10);
        sparseIntArray.append(72, 9);
        sparseIntArray.append(108, 13);
        sparseIntArray.append(111, 16);
        sparseIntArray.append(109, 14);
        sparseIntArray.append(106, 11);
        sparseIntArray.append(110, 15);
        sparseIntArray.append(107, 12);
        sparseIntArray.append(98, 40);
        sparseIntArray.append(83, 39);
        sparseIntArray.append(82, 41);
        sparseIntArray.append(97, 42);
        sparseIntArray.append(81, 20);
        sparseIntArray.append(96, 37);
        sparseIntArray.append(71, 5);
        sparseIntArray.append(84, 60);
        sparseIntArray.append(93, 60);
        sparseIntArray.append(87, 60);
        sparseIntArray.append(65, 60);
        sparseIntArray.append(61, 60);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(25, 31);
        sparseIntArray.append(26, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(15, 43);
        sparseIntArray.append(28, 44);
        sparseIntArray.append(23, 45);
        sparseIntArray.append(24, 46);
        sparseIntArray.append(20, 47);
        sparseIntArray.append(21, 48);
        sparseIntArray.append(16, 49);
        sparseIntArray.append(17, 50);
        sparseIntArray.append(18, 51);
        sparseIntArray.append(19, 52);
        sparseIntArray.append(27, 53);
        sparseIntArray.append(99, 54);
        sparseIntArray.append(77, 55);
        sparseIntArray.append(100, 56);
        sparseIntArray.append(78, 57);
        sparseIntArray.append(androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER, 58);
        sparseIntArray.append(79, 59);
        sparseIntArray.append(1, 38);
    }

    private static int b(android.content.res.TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public final void a(android.content.Context context, int i) {
        android.content.res.XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    java.lang.String name = xml.getName();
                    android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(xml);
                    defpackage.e eVar = new defpackage.e();
                    android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, defpackage.h.b);
                    int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                    for (int i2 = 0; i2 < indexCount; i2++) {
                        int index = typedArrayObtainStyledAttributes.getIndex(i2);
                        android.util.SparseIntArray sparseIntArray = c;
                        int i3 = sparseIntArray.get(index);
                        if (i3 != 60) {
                            switch (i3) {
                                case 1:
                                    eVar.p = b(typedArrayObtainStyledAttributes, index, eVar.p);
                                    break;
                                case 2:
                                    eVar.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.D);
                                    break;
                                case 3:
                                    eVar.o = b(typedArrayObtainStyledAttributes, index, eVar.o);
                                    break;
                                case 4:
                                    eVar.n = b(typedArrayObtainStyledAttributes, index, eVar.n);
                                    break;
                                case 5:
                                    eVar.w = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case 6:
                                    eVar.x = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.x);
                                    break;
                                case 7:
                                    eVar.y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.y);
                                    break;
                                case 8:
                                    eVar.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.E);
                                    break;
                                case 9:
                                    eVar.n = b(typedArrayObtainStyledAttributes, index, eVar.t);
                                    break;
                                case 10:
                                    eVar.s = b(typedArrayObtainStyledAttributes, index, eVar.s);
                                    break;
                                case 11:
                                    eVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.K);
                                    break;
                                case 12:
                                    eVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.L);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                                    eVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.H);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                                    eVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.J);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                                    eVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.M);
                                    break;
                                case 16:
                                    eVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.I);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                    eVar.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.e);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                                    eVar.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                                    eVar.g = typedArrayObtainStyledAttributes.getFloat(index, eVar.g);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                                    eVar.u = typedArrayObtainStyledAttributes.getFloat(index, eVar.u);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_LEFT /* 21 */:
                                    eVar.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, eVar.c);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_RIGHT /* 22 */:
                                    int i4 = typedArrayObtainStyledAttributes.getInt(index, eVar.G);
                                    eVar.G = i4;
                                    eVar.G = b[i4];
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_LEFT /* 23 */:
                                    eVar.b = typedArrayObtainStyledAttributes.getLayoutDimension(index, eVar.b);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                                    eVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.A);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_LEFT /* 25 */:
                                    eVar.h = b(typedArrayObtainStyledAttributes, index, eVar.h);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_RIGHT /* 26 */:
                                    eVar.i = b(typedArrayObtainStyledAttributes, index, eVar.i);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_LEFT /* 27 */:
                                    eVar.z = typedArrayObtainStyledAttributes.getInt(index, eVar.z);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                                    eVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.B);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                    eVar.j = b(typedArrayObtainStyledAttributes, index, eVar.j);
                                    break;
                                case 30:
                                    eVar.k = b(typedArrayObtainStyledAttributes, index, eVar.k);
                                    break;
                                case 31:
                                    eVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.F);
                                    break;
                                case 32:
                                    eVar.q = b(typedArrayObtainStyledAttributes, index, eVar.q);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                    eVar.r = b(typedArrayObtainStyledAttributes, index, eVar.r);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                    eVar.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.C);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                                    eVar.m = b(typedArrayObtainStyledAttributes, index, eVar.m);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_STRAIGHT /* 36 */:
                                    eVar.l = b(typedArrayObtainStyledAttributes, index, eVar.l);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                    eVar.v = typedArrayObtainStyledAttributes.getFloat(index, eVar.v);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                    eVar.d = typedArrayObtainStyledAttributes.getResourceId(index, eVar.d);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                    eVar.O = typedArrayObtainStyledAttributes.getFloat(index, eVar.O);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                    eVar.N = typedArrayObtainStyledAttributes.getFloat(index, eVar.N);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                    eVar.P = typedArrayObtainStyledAttributes.getInt(index, eVar.P);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                    eVar.Q = typedArrayObtainStyledAttributes.getInt(index, eVar.Q);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                    eVar.R = typedArrayObtainStyledAttributes.getFloat(index, eVar.R);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                    eVar.S = true;
                                    eVar.T = typedArrayObtainStyledAttributes.getFloat(index, eVar.T);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                    eVar.U = typedArrayObtainStyledAttributes.getFloat(index, eVar.U);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                    eVar.V = typedArrayObtainStyledAttributes.getFloat(index, eVar.V);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                    eVar.W = typedArrayObtainStyledAttributes.getFloat(index, eVar.W);
                                    break;
                                case 48:
                                    eVar.X = typedArrayObtainStyledAttributes.getFloat(index, eVar.X);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                    eVar.Y = typedArrayObtainStyledAttributes.getFloat(index, eVar.Y);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                    eVar.Z = typedArrayObtainStyledAttributes.getFloat(index, eVar.Z);
                                    break;
                                case 51:
                                    eVar.aa = typedArrayObtainStyledAttributes.getFloat(index, eVar.aa);
                                    break;
                                case 52:
                                    eVar.ab = typedArrayObtainStyledAttributes.getFloat(index, eVar.ab);
                                    break;
                                case 53:
                                    eVar.ac = typedArrayObtainStyledAttributes.getFloat(index, eVar.ac);
                                    break;
                                default:
                                    android.util.Log.w("ConstraintSet", "Unknown attribute 0x" + java.lang.Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                            }
                        } else {
                            android.util.Log.w("ConstraintSet", "unused attribute 0x" + java.lang.Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        }
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    if (name.equalsIgnoreCase("Guideline")) {
                        eVar.a = true;
                    }
                    this.a.put(java.lang.Integer.valueOf(eVar.d), eVar);
                } else {
                    continue;
                }
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (org.xmlpull.v1.XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}
