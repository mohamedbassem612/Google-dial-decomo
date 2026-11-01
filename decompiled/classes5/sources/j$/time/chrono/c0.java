package j$.time.chrono;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class c0 implements java.io.Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    public byte a;
    public java.lang.Object b;

    public c0(byte b, java.lang.Object obj) {
        this.a = b;
        this.b = obj;
    }

    private java.lang.Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(java.io.ObjectInput objectInput) throws java.io.IOException {
        java.lang.Object objL;
        byte b = objectInput.readByte();
        this.a = b;
        switch (b) {
            case 1:
                j$.util.concurrent.ConcurrentHashMap concurrentHashMap = j$.time.chrono.a.a;
                objL = j$.time.chrono.a.L(objectInput.readUTF());
                break;
            case 2:
                objL = ((j$.time.chrono.ChronoLocalDate) objectInput.readObject()).F((j$.time.j) objectInput.readObject());
                break;
            case 3:
                objL = ((j$.time.chrono.d) objectInput.readObject()).A((j$.time.ZoneOffset) objectInput.readObject()).w((j$.time.ZoneId) objectInput.readObject());
                break;
            case 4:
                j$.time.LocalDate localDate = j$.time.chrono.v.d;
                int i = objectInput.readInt();
                byte b2 = objectInput.readByte();
                byte b3 = objectInput.readByte();
                j$.time.chrono.t.c.getClass();
                objL = new j$.time.chrono.v(j$.time.LocalDate.of(i, b2, b3));
                break;
            case 5:
                j$.time.chrono.w wVar = j$.time.chrono.w.d;
                objL = j$.time.chrono.w.i(objectInput.readByte());
                break;
            case 6:
                j$.time.chrono.m mVar = (j$.time.chrono.m) objectInput.readObject();
                int i2 = objectInput.readInt();
                byte b4 = objectInput.readByte();
                byte b5 = objectInput.readByte();
                mVar.getClass();
                objL = new j$.time.chrono.o(mVar, i2, b4, b5);
                break;
            case 7:
                int i3 = objectInput.readInt();
                byte b6 = objectInput.readByte();
                byte b7 = objectInput.readByte();
                j$.time.chrono.y.c.getClass();
                objL = new j$.time.chrono.a0(j$.time.LocalDate.of(i3 + 1911, b6, b7));
                break;
            case 8:
                int i4 = objectInput.readInt();
                byte b8 = objectInput.readByte();
                byte b9 = objectInput.readByte();
                j$.time.chrono.e0.c.getClass();
                objL = new j$.time.chrono.g0(j$.time.LocalDate.of(i4 - 543, b8, b9));
                break;
            case 9:
                int i5 = j$.time.chrono.g.e;
                objL = new j$.time.chrono.g(j$.time.chrono.a.L(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new java.io.StreamCorruptedException("Unknown serialized type");
        }
        this.b = objL;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(java.io.ObjectOutput objectOutput) throws java.io.IOException {
        byte b = this.a;
        java.lang.Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                objectOutput.writeUTF(((j$.time.chrono.a) obj).C());
                return;
            case 2:
                j$.time.chrono.f fVar = (j$.time.chrono.f) obj;
                objectOutput.writeObject(fVar.a);
                objectOutput.writeObject(fVar.b);
                return;
            case 3:
                j$.time.chrono.j jVar = (j$.time.chrono.j) obj;
                objectOutput.writeObject(jVar.a);
                objectOutput.writeObject(jVar.b);
                objectOutput.writeObject(jVar.c);
                return;
            case 4:
                j$.time.chrono.v vVar = (j$.time.chrono.v) obj;
                vVar.getClass();
                objectOutput.writeInt(j$.time.temporal.m.a(vVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.m.a(vVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.m.a(vVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((j$.time.chrono.w) obj).a);
                return;
            case 6:
                j$.time.chrono.o oVar = (j$.time.chrono.o) obj;
                objectOutput.writeObject(oVar.a);
                objectOutput.writeInt(j$.time.temporal.m.a(oVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.m.a(oVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.m.a(oVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 7:
                j$.time.chrono.a0 a0Var = (j$.time.chrono.a0) obj;
                a0Var.getClass();
                objectOutput.writeInt(j$.time.temporal.m.a(a0Var, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.m.a(a0Var, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.m.a(a0Var, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                j$.time.chrono.g0 g0Var = (j$.time.chrono.g0) obj;
                g0Var.getClass();
                objectOutput.writeInt(j$.time.temporal.m.a(g0Var, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.m.a(g0Var, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.m.a(g0Var, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                j$.time.chrono.g gVar = (j$.time.chrono.g) obj;
                objectOutput.writeUTF(gVar.a.C());
                objectOutput.writeInt(gVar.b);
                objectOutput.writeInt(gVar.c);
                objectOutput.writeInt(gVar.d);
                return;
            default:
                throw new java.io.InvalidClassException("Unknown serialized type");
        }
    }

    public c0() {
    }
}
