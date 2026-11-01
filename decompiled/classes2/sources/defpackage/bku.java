package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bku extends aomh implements aonn {
    int a;
    final /* synthetic */ dji b;
    final /* synthetic */ kaw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bku(kaw kawVar, dji djiVar, aoln aolnVar) {
        super(2, aolnVar);
        this.c = kawVar;
        this.b = djiVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.CharSequence charSequence;
        aojh aojhVar;
        kaw kawVar;
        defpackage.vk vkVar;
        aojh aojhVar2 = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            kaw kawVar2 = this.c;
            dji djiVar = this.b;
            if (djiVar == null) {
                aojhVar = aojhVar2;
                kawVar = kawVar2;
                vkVar = null;
            } else {
                if (djiVar.d().isEmpty()) {
                    charSequence = djiVar.c;
                } else {
                    android.text.SpannableString spannableString = new android.text.SpannableString(djiVar.c);
                    android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                    java.util.List listD = djiVar.d();
                    int size = listD.size();
                    int i2 = 0;
                    while (i2 < size) {
                        djg djgVar = (djg) listD.get(i2);
                        dks dksVar = (dks) djgVar.a;
                        int i3 = djgVar.b;
                        int i4 = djgVar.c;
                        parcelObtain.recycle();
                        parcelObtain = android.os.Parcel.obtain();
                        int i5 = i2;
                        if (!anty.ah(dksVar.b(), cfd.S())) {
                            parcelObtain.writeByte((byte) 1);
                            parcelObtain.writeLong(dksVar.b());
                        }
                        long j = dksVar.b;
                        dpt[] dptVarArr = dps.a;
                        java.util.List list = listD;
                        aojh aojhVar3 = aojhVar2;
                        kaw kawVar3 = kawVar2;
                        if (!anty.ah(j, dpy.h(0L, Float.NaN))) {
                            parcelObtain.writeByte((byte) 2);
                            defpackage.avo.f(j, parcelObtain);
                        }
                        dnd dndVar = dksVar.c;
                        byte b = 3;
                        if (dndVar != null) {
                            parcelObtain.writeByte((byte) 3);
                            parcelObtain.writeInt(dndVar.h);
                        }
                        dmw dmwVar = dksVar.d;
                        if (dmwVar != null) {
                            parcelObtain.writeByte((byte) 4);
                            int i6 = dmwVar.a;
                            parcelObtain.writeByte((a.x(i6, 0) || !a.x(i6, 1)) ? (byte) 0 : (byte) 1);
                        }
                        dmx dmxVar = dksVar.e;
                        if (dmxVar != null) {
                            parcelObtain.writeByte((byte) 5);
                            int i7 = dmxVar.a;
                            if (a.x(i7, 0)) {
                                b = 0;
                            } else if (a.x(i7, 65535)) {
                                b = 1;
                            } else if (a.x(i7, 1)) {
                                b = 2;
                            } else if (!a.x(i7, 2)) {
                                b = 0;
                            }
                            parcelObtain.writeByte(b);
                        }
                        java.lang.String str = dksVar.g;
                        if (str != null) {
                            parcelObtain.writeByte((byte) 6);
                            parcelObtain.writeString(str);
                        }
                        long j2 = dksVar.h;
                        if (!anty.ah(j2, dpy.h(0L, Float.NaN))) {
                            parcelObtain.writeByte((byte) 7);
                            defpackage.avo.f(j2, parcelObtain);
                        }
                        dok dokVar = dksVar.i;
                        if (dokVar != null) {
                            parcelObtain.writeByte((byte) 8);
                            parcelObtain.writeFloat(dokVar.a);
                        }
                        doz dozVar = dksVar.j;
                        if (dozVar != null) {
                            parcelObtain.writeByte((byte) 9);
                            parcelObtain.writeFloat(dozVar.b);
                            parcelObtain.writeFloat(dozVar.c);
                        }
                        long j3 = dksVar.l;
                        if (!anty.ah(j3, cfd.S())) {
                            parcelObtain.writeByte((byte) 10);
                            parcelObtain.writeLong(j3);
                        }
                        dou douVar = dksVar.m;
                        if (douVar != null) {
                            parcelObtain.writeByte((byte) 11);
                            parcelObtain.writeInt(douVar.d);
                        }
                        crc crcVar = dksVar.n;
                        if (crcVar != null) {
                            parcelObtain.writeByte((byte) 12);
                            parcelObtain.writeLong(crcVar.b);
                            long j4 = crcVar.c;
                            parcelObtain.writeFloat(java.lang.Float.intBitsToFloat((int) (j4 >> 32)));
                            parcelObtain.writeFloat(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)));
                            parcelObtain.writeFloat(crcVar.d);
                        }
                        spannableString.setSpan(new android.text.Annotation("androidx.compose.text.SpanStyle", android.util.Base64.encodeToString(parcelObtain.marshall(), 0)), i3, i4, 33);
                        i2 = i5 + 1;
                        listD = list;
                        aojhVar2 = aojhVar3;
                        kawVar2 = kawVar3;
                    }
                    charSequence = spannableString;
                }
                aojhVar = aojhVar2;
                kawVar = kawVar2;
                vkVar = new defpackage.vk(android.content.ClipData.newPlainText("plain text", charSequence), (byte[]) null);
            }
            this.a = 1;
            java.lang.Object obj2 = kawVar.a;
            if (vkVar == null) {
                ft$.ExternalSyntheticApiModelOutline0.m(((ddu) obj2).a());
            } else {
                ((ddu) obj2).a().setPrimaryClip((android.content.ClipData) vkVar.a);
            }
            aojh aojhVar4 = aojhVar;
            if (aojh.a == aojhVar4) {
                return aojhVar4;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.bku(this.c, this.b, aolnVar);
    }
}
